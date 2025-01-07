package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.Sorter;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadixSort extends SortingAlgorithm implements Sorter {
  public Result sort(List<Integer> list) {
    int maxElement = getMax(list);

    for (int place = 1; maxElement / place > 0; place *= 10)
      countingSortAsc(list, place);

    return new Result(list, comparisonCount);
  }

  private void countingSortAsc(List<Integer> list, int place) {
    int size = list.size();
    List<Integer> output = new ArrayList<>(Collections.nCopies(size, 0));
    List<Integer> count = new ArrayList<>(Collections.nCopies(10, 0));

    for (int j : list) {
      incrementComparisonCount();
      int index = (j / place) % 10;
      count.set(index, count.get(index) + 1);
    }

    for (int i = 1; i < 10; i++)
      count.set(i, count.get(i) + count.get(i - 1));

    for (int i = size - 1; i >= 0; i--) {
      int index = (list.get(i) / place) % 10;
      output.set(count.get(index) - 1, list.get(i));
      count.set(index, count.get(index) - 1);
    }

    for (int i = 0; i < size; i++)
      list.set(i, output.get(i));
  }

  private int getMax(List<Integer> list) {
    int max = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > max)
        max = list.get(i);
    }
    return max;
  }
}