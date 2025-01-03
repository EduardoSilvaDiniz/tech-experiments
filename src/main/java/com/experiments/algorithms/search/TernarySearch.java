package com.experiments.algorithms.search;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.SearchAlgorithm;
import com.experiments.algorithms.base.Searcher;
import java.util.List;

public class TernarySearch extends SearchAlgorithm implements Searcher {
  @Override
  public Result search(List<Integer> list, int target) {
    return new Result(search(list, target, 0, list.size()), comparisonCount);
  }

  private int search(List<Integer> list, int target, int l, int r) {
    if (r >= l) {
      int mid1 = l + (r - l) / 3;
      int mid2 = r - (r - l) / 3;

      if (list.get(mid1) == target)
        return mid1;
      if (list.get(mid2) == target)
        return mid2;

      if (target < list.get(mid1))
        return search(list, target, l, mid1 - 1);
      else if (target > list.get(mid2))
        return search(list, target, mid2 + 1, r);
      else
        return search(list, target, mid1 + 1, mid2 - 1);
    }
    throw new IllegalArgumentException("value not found");
  }
}