package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShellSortUnitTest {

  private ShellSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new ShellSort();
  }

  @Test
  public void shellSortTest() {
    System.out.println("Shell Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);
  }
}