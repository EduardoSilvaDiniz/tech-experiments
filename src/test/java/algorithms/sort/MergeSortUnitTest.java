package test.java.algorithms.sort;

import main.java.algorithms.sort.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeSortUnitTest {
  private MergeSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new MergeSort();
  }

  @Test
  public void insertionSortTest() {
    System.out.println("Merge Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);
  }
}
