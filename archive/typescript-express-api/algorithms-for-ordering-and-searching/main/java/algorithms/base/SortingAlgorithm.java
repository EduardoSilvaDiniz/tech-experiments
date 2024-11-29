package main.java.algorithms.base;

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

  public abstract Result sort(int[] list);
}