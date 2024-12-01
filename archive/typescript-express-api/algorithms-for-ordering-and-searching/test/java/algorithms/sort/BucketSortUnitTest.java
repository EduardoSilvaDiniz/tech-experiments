package test.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.sort.BucketSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BucketSortUnitTest {
  private BucketSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new BucketSort();
  }

  @Test
  void givenUnsortedList_whenSortedUsingBucketSorter_checkSortingCorrect() {
    List<Integer> unsorted = Arrays.asList(80,50,60,30,20,10,70,0,40,500,600,602,200,15);
    List<Integer> expected = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);

    Result actual = sorter.sort(unsorted);

    assertEquals(expected, actual.list);
    System.out.println(actual.comparisons + " Vezes que o algoritmo fez comparações");
  }
}