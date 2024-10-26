#include "main.h"

int binarySearch(int list[], int low, int high, int value) {
  while (low <= high) {
    int mid = low + (high - low) / 2;

    if (list[mid] == value)
      return mid;
    if (list[mid] < value)
      low = mid + 1;
    else
      high = mid - 1;
  }

  return NOT_FOUND;
}
