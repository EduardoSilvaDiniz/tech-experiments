package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortUnitTest {

  private QuickSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new QuickSort();
  }

  @Test
  public void quickSortTest() {
    System.out.println("Quick Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);

  }
}
