package main.java.algorithms.base;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
  public List<T> list;
  public int comparisons;

  public Result(T item, int comparisons) {
    list = new ArrayList<>();
    list.add(item);
    this.comparisons = comparisons;
  }
}