package test.java.algorithms.sort;

import main.java.algorithms.sort.InsertionSort;
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
