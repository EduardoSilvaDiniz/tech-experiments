package test.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.sort.SelectionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortUnitTest {

  private SelectionSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new SelectionSort();
  }

  @Test
  public void selectionSortTest() {
    System.out.println("Selection Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);

  }
}
