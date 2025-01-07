package main.java.algorithms.base;

import java.util.ArrayList;
import java.util.List;

public class Result {
  public List<Integer> list;
  public int comparisons;

  public Result(Integer item, int comparisons) {
    list = new ArrayList<>();
    list.add(item);
    this.comparisons = comparisons;
  }

  public Result(List<Integer> item, int comparisons) {
    list = new ArrayList<>();
    list.addAll(item);
    this.comparisons = comparisons;
  }
}