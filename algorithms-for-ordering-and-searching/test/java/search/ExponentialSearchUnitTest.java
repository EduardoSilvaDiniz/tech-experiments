package test.java.search;

import main.java.search.ExponentialSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentialSearchUnitTest {

  @Test
  public void testBinarySearch() {
    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertEquals(0, ExponentialSearch.search(list, 1));
    assertEquals(1, ExponentialSearch.search(list, 2));
    assertEquals(2, ExponentialSearch.search(list, 3));
    assertEquals(3, ExponentialSearch.search(list, 4));
    assertEquals(4, ExponentialSearch.search(list, 5));
    assertEquals(5, ExponentialSearch.search(list, 6));
    assertEquals(6, ExponentialSearch.search(list, 7));
  }
}