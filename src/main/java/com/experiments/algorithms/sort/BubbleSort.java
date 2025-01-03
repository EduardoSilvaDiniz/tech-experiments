package com.experiments.algorithms.sort;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.Sorter;
import com.experiments.algorithms.base.SortingAlgorithm;
import java.util.List;

public class BubbleSort extends SortingAlgorithm implements Sorter {
  public Result sort(List<Integer> list) {
    int aux;

    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          incrementComparisonCount();
          aux = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, aux);
        }
      }
    }
    return new Result(list, comparisonCount);
  }
}