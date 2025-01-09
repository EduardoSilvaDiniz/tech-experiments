#include <omp.h>
#include <stddef.h>
#include <stdio.h>
#include <unistd.h>

typedef struct block {
  size_t size;
  struct block *next;
  int free;
} block_t;

#define BLOCK_SIZE sizeof(block_t)

block_t *free_list = NULL;

block_t *find_free_block(block_t **last, size_t size) {
  block_t *current = free_list;
  while (current && !(current->free && current->size >= size)) {
    *last = current;
    current = current->next;
  }
  return current;
}

block_t *extend_heap(block_t *last, size_t size) {
  block_t *block;
  block = sbrk(0);
  if (sbrk(BLOCK_SIZE + size) == (void *)-1) {
    return NULL;
  }
  block->size = size;
  block->next = NULL;
  block->free = 0;
  if (last) {
    last->next = block;
  }
  return block;
}

void *mime_malloc(size_t size) {
  block_t *block;

  if (size <= 0) {
    return NULL;
  }

  if (!free_list) {
    block = extend_heap(NULL, size);
    if (!block) {
      return NULL;
    }
    free_list = block;
  } else {
    block_t *last = free_list;
    block = find_free_block(&last, size);
    if (!block) {
      block = extend_heap(last, size);
      if (!block) {
        return NULL;
      } else {
        block->free = 0;
      }
    }
  }

  return (block + 1);
}

void mime_free(void *ptr) {
  if (!ptr) {
    return;
  }

  block_t *block = (block_t *)ptr - 1;
  block->free = 1;
}

int main(int argc, char *argv[]) {
  int n = 1000000;
  long double *arr[n];

#pragma omp parallel for
  for (size_t i = 0; i <= n; i++) {
    arr[i] = mime_malloc(sizeof(long double));

    if (arr[i] == NULL) {
      return 1;
    }

    *arr[i] = i;

    printf("%Lf -> %p\n", *arr[i], arr[i]);
  }

  mime_free(arr);

  return 0;
}
