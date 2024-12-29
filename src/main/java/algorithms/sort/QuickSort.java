package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.Sorter;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.List;

public class QuickSort extends SortingAlgorithm implements Sorter {
  public Result sort(List<Integer> list) {
    int begin = 0;
    int end = list.size() - 1;

    if (begin < end) {
      incrementComparisonCount();
      int partitionIndex = partition(list, begin, end);

      sort(list, begin, partitionIndex - 1);
      sort(list, partitionIndex + 1, end);
    }
    return new Result(list, comparisonCount);
  }

  private void sort(List<Integer> list, int begin, int end) {
    if (begin < end) {
      incrementComparisonCount();
      int partitionIndex = partition(list, begin, end);

      sort(list, begin, partitionIndex - 1);
      sort(list, partitionIndex + 1, end);
    }
  }

  private int partition(List<Integer> list, int begin, int end) {
    int pivot = list.get(end);
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (list.get(j) <= pivot) {
        i++;
        incrementComparisonCount();

        int swapTemp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, swapTemp);
      }
    }

    int swapTemp = list.get(i + 1);
    list.set(i + 1, list.get(end));
    list.set(end, swapTemp);

    return i + 1;
  }
}
