#include "main.h"
#include "binary_search.h"
#include <stdio.h>

int main() {
  int list[LIST_SIZE] = {10, 12, 14, 16, 18, 20, 25, 30};
  int userValue = 0;

  showList(list);

  while (userValue != -1) {
    printf("\nvalue to search: ");
    scanf("%d", &userValue);

    garbageCollector();

    if (userValue == -1)
      break;

    printf("Index: %d\n", exponentialSearch(list, LIST_SIZE, userValue));
  }
  return 0;
}

void garbageCollector() {
  char garbage;
  do {
    garbage = getchar();
  } while (garbage != '\n');
}

void showList(int list[]) {
  printf("List -> ");
  for (int i = 0; i < LIST_SIZE; i++)
    printf("%d ", list[i]);
}

int exponentialSearch(int list[], int size, int value) {
  if (size <= 0) {
    return NOT_LIST;
  }

  int bound = 1;
  while (bound < size && list[bound] < value)
    bound *= 2;

  return binarySearch(list, bound / 2, min(bound, size), value);
}

int min(int arg1, int arg2) { return arg1 > arg2 ? arg1 : arg2; }
