package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

public class BubbleSort extends SortingAlgorithm {
  @Override
  public Result sort(int[] list) {
    int aux;
    int comparisonCount = 0;

    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list.length - 1; j++) {
        comparisonCount++;
        if (list[j] > list[j + 1]) {
          aux = list[j];
          list[j] = list[j + 1];
          list[j + 1] = aux;
        }
      }
    }
    System.out.println(comparisonCount);
    return new Result(list, comparisonCount);
  }
}

