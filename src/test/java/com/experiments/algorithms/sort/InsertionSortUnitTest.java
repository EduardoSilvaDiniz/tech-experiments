package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertionSortUnitTest {
  private InsertionSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new InsertionSort();
  }

  @Test
  public void insertionSortTest() {
    System.out.println("Insertion Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);
  }
}
