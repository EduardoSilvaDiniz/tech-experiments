package com.experiments.algorithms.sort;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.Sorter;
import com.experiments.algorithms.base.SortingAlgorithm;
import java.util.List;

public class InsertionSort extends SortingAlgorithm implements Sorter {
  public Result sort(List<Integer> list) {
    int size = list.size();

    for (int i = 1; i < size; i++) {
      int key = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j) > key) {
        incrementComparisonCount();
        list.set(j + 1, list.get(j--));
      }
      incrementComparisonCount();
      list.set(j + 1, key);
    }
    return new Result(list, comparisonCount);
  }
}
