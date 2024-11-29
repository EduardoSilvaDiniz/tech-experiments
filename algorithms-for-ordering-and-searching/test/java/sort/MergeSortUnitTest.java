package test.java.sort;

import main.java.sort.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortUnitTest {

  @Test
  void givenUnsortedList_whenSortedUsingBucketSorter_checkSortingCorrect() {
    Random rand = new Random();
    int[] unsorted = {80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15};
    int[] expected = {0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602};

    MergeSort.sort(unsorted);

    assertEquals(expected[0], unsorted[0]);
    assertEquals(expected[unsorted.length / 2], unsorted[unsorted.length / 2]);
    assertEquals(expected[unsorted.length - 1], unsorted[unsorted.length - 1]);
  }
}
