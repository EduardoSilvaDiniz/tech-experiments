package test.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.sort.RadixSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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