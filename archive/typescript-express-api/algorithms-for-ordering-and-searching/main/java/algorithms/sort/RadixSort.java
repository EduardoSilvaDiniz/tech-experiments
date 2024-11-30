package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.List;

public class RadixSort extends SortingAlgorithm {
  @Override
  public Result sort(List<Integer> list) {
    int maxElement = getMax(list);

    for (int place = 1; maxElement / place > 0; place *= 10)
      countingSortAsc(list, place);

    return new Result(list, comparisonCount);
  }

  private static void countingSortAsc(List<Integer> list, int place) {
    int length = list.size();
    int[] output = new int[length];
    int[] count = new int[10];

    for (int j : list) {
      int index = (j / place) % 10;
      count[index]++;
    }

    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    for (int i = length - 1; i >= 0; i--) {
      int index = (list.get(i) / place) % 10;
      output[count[index] - 1] = list.get(i);
      count[index]--;
    }

    System.arraycopy(output, 0, list, 0, length);
    for (Integer key : output)
      list.add

  }

  private static int getMax(List<Integer> list) {
    int max = list.getFirst();
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > max) {
        max = list.get(i);
      }
    }
    return max;
  }
}