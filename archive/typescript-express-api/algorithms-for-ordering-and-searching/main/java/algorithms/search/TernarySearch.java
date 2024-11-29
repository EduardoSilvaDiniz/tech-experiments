package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;

public class TernarySearch extends SearchAlgorithm {
      /*
  @Override
  public Result search(int[] list, int value) {
    int l = 0;
    int r = list.length - 1;

    if (r >= l) {
      int mid1 = l + (r - l) / 3;
      int mid2 = r - (r - l) / 3;

      if (list[mid1] == value)
        return mid1;
      if (list[mid2] == value)
        return mid2;

      if (value < list[mid1])
        return search(list, value, l, mid1 - 1);
      else if (value > list[mid2])
        return search(list, value, mid2 + 1, r);
      else
        return search(list, value, mid1 + 1, mid2 - 1);

    }
    return -1;
  }
       */

  private static int search(int[] ar, int key, int l, int r) {
    if (r >= l) {
      int mid1 = l + (r - l) / 3;
      int mid2 = r - (r - l) / 3;

      if (ar[mid1] == key)
        return mid1;
      if (ar[mid2] == key)
        return mid2;

      if (key < ar[mid1])
        return search(ar, key, l, mid1 - 1);
      else if (key > ar[mid2])
        return search(ar, key, mid2 + 1, r);
      else
        return search(ar, key, mid1 + 1, mid2 - 1);
    }
    return -1;
  }

  @Override
  public Result search(int[] list, int target) {
    return null;
  }
}