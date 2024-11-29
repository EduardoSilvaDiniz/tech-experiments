package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;

public class InterpolationSearch extends SearchAlgorithm {
  @Override
  public Result search(int[] list, int value) {
    int low = 0;
    int high = list.length - 1;

    if (low <= high && value >= list[low] && value <= list[high]) {
      int mid = low + ((value - list[low]) * (high - low) / (list[high] - list[low]));

      //if (list[mid] == value) return mid;

      //if (list[mid] > value) return search(list, value, low, mid - 1);

      return new Result(search(list, value, mid + 1, high), comparisonCount);
    }
    throw new IllegalArgumentException("value not found");
  }

  private int search(int[] list, int value, int low, int high) {
    if (low <= high && value >= list[low] && value <= list[high]) {
      int mid = low + ((value - list[low]) * (high - low) / (list[high] - list[low]));

      if (list[mid] == value) return mid;

      if (list[mid] > value) return search(list, value, low, mid - 1);

      return search(list, value, mid + 1, high);
    }
    throw new IllegalArgumentException("value not found");
  }
}
