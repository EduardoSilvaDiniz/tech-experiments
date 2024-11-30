package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;
import main.java.algorithms.base.Searcher;

import java.util.List;

public class BinarySearch extends SearchAlgorithm implements Searcher {
  public Result search(List<Integer> list, int target) {
    if (list.isEmpty())
      throw new IllegalArgumentException("empty list");

    int low = 0;
    int high = list.size();

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (list.get(mid) == target)
        return new Result(mid, comparisonCount);
      if (list.get(mid) < target)
        low = mid + 1;
      else
        high = mid - 1;
    }

    throw new IllegalArgumentException("value not found");
  }

  public int search(List<Integer> list, int value, int low, int high) {
    if (list.isEmpty())
      throw new IllegalArgumentException("empty list");

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (list.get(mid) == value)
        return mid;
      if (list.get(mid) < value)
        low = mid + 1;
      else
        high = mid - 1;
    }

    throw new IllegalArgumentException("value not found");
  }
}