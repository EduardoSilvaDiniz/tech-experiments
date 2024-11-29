package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;

public class ExponentialSearch extends SearchAlgorithm {
  public Result search(int[] list, int value) {
    if (list.length == 0)
      throw new IllegalArgumentException("empty list");

    if (list.length == 1)
      return new Result(list[0], comparisonCount);

    int listSize = list.length - 1;
    int exponentialValue = 1;

    while (exponentialValue < listSize && list[exponentialValue] < value)
      exponentialValue *= 2;


    BinarySearch binarySearch = new BinarySearch();
    //return new Result(binarySearch.search(list, value, exponentialValue / 2, Math.min(exponentialValue, listSize), comparisonCount));
    return new Result(1,1);
  }
}