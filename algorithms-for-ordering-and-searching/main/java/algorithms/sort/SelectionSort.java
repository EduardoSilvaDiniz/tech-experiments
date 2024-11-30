package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.List;

public class SelectionSort extends SortingAlgorithm {
  public Result sort(List<Integer> list) {
    int size = list.size();
    for (int i = 0; i < size - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < size; j++) {
        if (list.get(j) < list.get(minIndex)) {
          incrementComparisonCount();
          minIndex = j;
        }
      }
      int temp = list.get(minIndex);
      list.set(minIndex, list.get(i));
      list.set(i, temp);
    }
    return new Result(list, comparisonCount);
  }
}
