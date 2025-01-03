package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadixSortUnitTest {
  private RadixSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new RadixSort();
  }

  @Test
  public void radixSortTestAsc() {
    System.out.println("Radix Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);

  }
}