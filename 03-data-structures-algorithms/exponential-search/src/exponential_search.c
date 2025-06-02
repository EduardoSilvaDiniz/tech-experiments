#include "exponential_search.h"
#include "binary_search.h"
#include <stdio.h>

void garbage_collector() {
  char garbage;
  do {
    garbage = getchar();
  } while (garbage != '\n');
}

void show_list(int list[]) {
  printf("List -> ");
  for (int i = 0; i < LIST_SIZE; i++)
    printf("%d ", list[i]);
}

int exponential_search(int list[], int size, int key) {
  if (size <= 0) {
    return NOT_LIST;
  }

  int exponentialValue = 1;
  while (exponentialValue < size && list[exponentialValue] < key)
    exponentialValue *= 2;

  return binary_search(list, key, exponentialValue / 2,
                       min(exponentialValue, size));
}

int min(int arg1, int arg2) { return arg1 > arg2 ? arg1 : arg2; }
