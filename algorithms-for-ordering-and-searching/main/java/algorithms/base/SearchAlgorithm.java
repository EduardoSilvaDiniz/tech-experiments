package main.java.algorithms.base;

import java.util.List;

public abstract class SearchAlgorithm {
  protected int comparisonCount;

  public SearchAlgorithm() {
    this.comparisonCount = 0;
  }

  public int getComparisonCount() {
    return comparisonCount;
  }

  protected void incrementComparisonCount() {
    comparisonCount++;
  }

  public abstract Result search(List<Integer> list, int target);
}
