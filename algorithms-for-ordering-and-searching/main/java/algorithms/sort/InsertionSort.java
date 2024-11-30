package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.List;

public class InsertionSort extends SortingAlgorithm {
  public Result sort(List<Integer> list) {
    int size = list.size();

    for (int i = 1; i < size; i++) {
      int key = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j) > key) {
        incrementComparisonCount();
        list.set(j+1, list.get(j));
        j--;
      }
      incrementComparisonCount();
      list.set(j+1, key);
    }
    return new Result(list, comparisonCount);
  }
}
