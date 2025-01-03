package com.experiments.algorithms.search;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.SearchAlgorithm;
import com.experiments.algorithms.base.Searcher;
import java.util.List;

public class ExponentialSearch extends SearchAlgorithm implements Searcher {
  public Result search(List<Integer> list, int target) {
    if (list.isEmpty())
      throw new IllegalArgumentException("empty list");

    if (list.size() == 1)
      return new Result(list, comparisonCount);

    int listSize = list.size();
    int exponentialValue = 1;

    while (exponentialValue < listSize && list.get(exponentialValue) < target)
      exponentialValue *= 2;


    BinarySearch binarySearch = new BinarySearch();
    return new Result(binarySearch.search(list, target, exponentialValue / 2, Math.min(exponentialValue, listSize)), comparisonCount);
  }
}