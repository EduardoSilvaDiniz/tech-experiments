package com.experiments.algorithms.search;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.SearchAlgorithm;
import com.experiments.algorithms.base.Searcher;
import java.util.List;

public class InterpolationSearch extends SearchAlgorithm implements Searcher {
  @Override
  public Result search(List<Integer> list, int target) {
    return new Result(interpolationSearch(list, target, 0, list.size()-1), comparisonCount);
  }

  public int interpolationSearch(List<Integer> list, int target, int low, int high) {
    int pos;

    if (low <= high && target >= list.get(low) && target <= list.get(high)) {
      if (list.get(high) == list.get(low)) {
        if (list.get(low) == target) {
          return low;
        }
        return -1;
      }
      pos = low + (((high - low) / (list.get(high) - list.get(low))) * (target - list.get(low)));
      if (pos < low || pos > high) {
        return -1;
      }

      if (list.get(pos) == target)
        return pos;
      if (list.get(pos) < target)
        return interpolationSearch(list, target ,pos + 1, high);
      if (list.get(pos) > target)
        return interpolationSearch(list, target, low, pos-1);
    }
    throw new IllegalArgumentException("value not found");
  }
}