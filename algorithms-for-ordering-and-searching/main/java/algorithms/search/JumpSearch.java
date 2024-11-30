package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;

import java.util.List;

public class JumpSearch extends SearchAlgorithm {
  @Override
  public Result search(List<Integer> list, int target) {
    return new Result(jumpSearch(list, target), comparisonCount);
  }

  public int jumpSearch(List<Integer> list, int target) {
    int n = list.size();

    int step = (int) Math.floor(Math.sqrt(n));

    int prev = 0;
    for (int minStep = Math.min(step, n) - 1; list.get(minStep) < target; minStep = Math.min(step, n) - 1) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(n));
      if (prev >= n)
        return -1;
    }

    while (list.get(prev) < target) {
      prev++;

      if (prev == Math.min(step, n))
        return -1;
    }

    if (list.get(prev) == target)
      return prev;

    return -1;
  }
}