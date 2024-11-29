package test.java.search;

import main.java.search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinarySearchUnitTest {

  @Test
  public void testBinarySearch() {
    int[] list = {1, 2, 3, 4, 5};
    Assertions.assertEquals(0, BinarySearch.search(list, 1));
    Assertions.assertEquals(1, BinarySearch.search(list, 2));
    Assertions.assertEquals(2, BinarySearch.search(list, 3));
    Assertions.assertEquals(3, BinarySearch.search(list, 4));
    Assertions.assertEquals(4, BinarySearch.search(list, 5));
  }
}
