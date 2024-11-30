package test.java.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.sort.BucketSort;
import main.java.algorithms.sort.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortUnitTest {
  private InsertionSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new InsertionSort();
  }

  @Test
  public void insertionSortTest() {

    List<Integer> unsorted = Arrays.asList(80,50,60,30,20,10,70,0,40,500,600,602,200,15);
    List<Integer> expected = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);

    Result actual = sorter.sort(unsorted);
    int sizeMid = expected.size() / 2;

    Assertions.assertEquals(expected.getFirst(), actual.list.getFirst());
    Assertions.assertEquals(expected.get(sizeMid), actual.list.get(sizeMid));
    Assertions.assertEquals(expected.getLast(), actual.list.getLast());
    System.out.println(actual.comparisons + " Vezes que o algoritmo fez comparações");
  }
}
