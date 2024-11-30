package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.List;

public class BubbleSort extends SortingAlgorithm {
  @Override
  public Result sort(List<Integer> list) {
    int aux;
    int comparisonCount = 0;

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        comparisonCount++;
        if (list.get(j) > list.get(j + 1)) {
          aux = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j+1, aux);
        }
      }
    }
    System.out.println(comparisonCount);
    return new Result(list, comparisonCount);
  }
}

