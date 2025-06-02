#include "binary_search.h"

int binary_search(int list[], int value, int low, int high) {
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
