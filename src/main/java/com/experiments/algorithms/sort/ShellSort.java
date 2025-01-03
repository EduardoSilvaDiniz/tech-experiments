package com.experiments.algorithms.sort;

import com.experiments.algorithms.base.Result;
import com.experiments.algorithms.base.Sorter;
import com.experiments.algorithms.base.SortingAlgorithm;
import java.util.List;

public class ShellSort extends SortingAlgorithm implements Sorter {
  public Result sort(List<Integer> listToSort) {
    int size = listToSort.size();

    for (int gap = size / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < size; i++) {
        int key = listToSort.get(i);
        int j = i;
        while (j >= gap && listToSort.get(j - gap) > key) {
          incrementComparisonCount();
          listToSort.set(j, listToSort.get(j - gap));
          j -= gap;
        }
        listToSort.set(j, key);
      }
    }
    return new Result(listToSort, comparisonCount);
  }
}
