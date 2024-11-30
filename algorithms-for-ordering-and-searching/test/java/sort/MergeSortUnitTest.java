package test.java.sort;

import main.java.algorithms.sort.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortUnitTest {

  @Test
  void givenUnsortedList_whenSortedUsingBucketSorter_checkSortingCorrect() {
    int[] list = {80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15};
    int[] listOrder = {0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602};


    MergeSort mergeSort = new MergeSort();
    //mergeSort.sort(list);

    assertEquals(listOrder[0], list[0]);
    assertEquals(listOrder[list.length / 2], list[list.length / 2]);
    assertEquals(listOrder[list.length - 1], list[list.length - 1]);
  }
}
