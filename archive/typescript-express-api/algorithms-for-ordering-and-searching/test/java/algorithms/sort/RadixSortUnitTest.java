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

    List<Integer> unsorted = Arrays.asList(80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15);
    List<Integer> expected = Arrays.asList(0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602);

    Result actual = sorter.sort(unsorted);
    int sizeMid = expected.size() / 2;

    assertEquals(expected, actual.list);
    System.out.println(actual.comparisons + " Vezes que o algoritmo fez comparações");
  }
}