package test.java.search;

import main.java.search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinarySearchTest {

  @Test
  public void testBinarySearch() {
    int[] sortedList = {1, 2, 3, 4, 5};
    Assertions.assertEquals(0, BinarySearch.binarySearch(sortedList, 1));
    Assertions.assertEquals(1, BinarySearch.binarySearch(sortedList, 2));
    Assertions.assertEquals(2, BinarySearch.binarySearch(sortedList, 3));
    Assertions.assertEquals(3, BinarySearch.binarySearch(sortedList, 4));
    Assertions.assertEquals(4, BinarySearch.binarySearch(sortedList, 5));
  }
}
