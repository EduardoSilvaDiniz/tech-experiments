package test.java.search;

import main.java.algorithms.search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinarySearchUnitTest {
  BinarySearch binarySearch = new BinarySearch();
  @Test
  public void testBinarySearch() {
    int[] list = {13, 14, 16, 20, 47, 69, 75, 80, 85, 90};

    for (int i = 0; i < list.length; i++) {
      Assertions.assertEquals(i, binarySearch.search(list, list[i]).list.getFirst());
    }
  }
}
