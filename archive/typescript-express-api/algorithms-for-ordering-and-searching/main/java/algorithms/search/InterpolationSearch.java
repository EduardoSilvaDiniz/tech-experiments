package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;
import main.java.algorithms.base.Searcher;

import java.util.List;

public class InterpolationSearch extends SearchAlgorithm implements Searcher {
  @Override
  public Result search(List<Integer> list, int target) {
    return new Result(interpolationSearch(list, target, 0, list.size()-1), comparisonCount);
  }

  public int interpolationSearch(List<Integer> list, int target, int low, int high) {
    int pos;

    if (low <= high && target >= list.get(low) && target <= list.get(high)) {
      // Evita divisão por zero
      if (list.get(high) == list.get(low)) {
        if (list.get(low) == target) {
          return low; // O target é igual ao valor em low
        }
        return -1; // O target não está presente
      }

      pos = low + (((high - low) / (list.get(high) - list.get(low))) * (target - list.get(low)));

      if (pos < low || pos > high) {
        return -1; // O target não está presente
      }

      // Condition of target found
      if (list.get(pos) == target)
        return pos;

      // If x is larger, x is in right sub array
      if (list.get(pos) < target)
        return interpolationSearch(list, target ,pos + 1, high);

      // If x is smaller, x is in left sub array
      if (list.get(pos) > target)
        return interpolationSearch(list, target, low, pos-1);
    }
    throw new IllegalArgumentException("value not found");
  }

}
