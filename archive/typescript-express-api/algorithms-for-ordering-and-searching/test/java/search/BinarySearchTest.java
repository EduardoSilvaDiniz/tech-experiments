package test.java.search;

import main.java.search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

  @Test
  public void testBinarySearch() {
    int[] sortedList = {1, 2, 3, 4, 5};
    assertEquals(0, BinarySearch.binarySearch(sortedList, 1));
    assertEquals(1, BinarySearch.binarySearch(sortedList, 2));
    assertEquals(2, BinarySearch.binarySearch(sortedList, 3));
    assertEquals(3, BinarySearch.binarySearch(sortedList, 4));
    assertEquals(4, BinarySearch.binarySearch(sortedList, 5));
  }
}
