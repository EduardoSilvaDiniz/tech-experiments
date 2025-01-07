package main.java.algorithms.base;

import java.util.List;

public abstract class SortingAlgorithm {
  protected int comparisonCount;

  public SortingAlgorithm() {
    this.comparisonCount = 0;
  }

  public int getComparisonCount() {
    return comparisonCount;
  }

  protected void incrementComparisonCount() {
    comparisonCount++;
  }
}