package test.java.algorithms.sort;

import main.java.algorithms.base.GenerateList;
import main.java.algorithms.base.Result;
import main.java.algorithms.sort.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
