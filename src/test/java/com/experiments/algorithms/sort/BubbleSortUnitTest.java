package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortUnitTest {

  private BubbleSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new BubbleSort();
  }

  @Test
  public void bubbleSortTest() {
    System.out.println("Bubble Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);
  }
}
