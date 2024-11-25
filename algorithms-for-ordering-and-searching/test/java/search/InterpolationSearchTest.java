package test.java.search;

import main.java.search.InterpolationSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterpolationSearchTest {
  @Test
  public void interpolationSearchTest() {
    int[] arr = {13, 14, 16, 20, 47, 69, 75, 80, 85, 90};
    Assertions.assertEquals(0, InterpolationSearch.interpolationSearch(arr, 13, 0, 9));
    Assertions.assertEquals(1, InterpolationSearch.interpolationSearch(arr, 14, 0, 9));
    Assertions.assertEquals(2, InterpolationSearch.interpolationSearch(arr, 16, 0, 9));
    Assertions.assertEquals(3, InterpolationSearch.interpolationSearch(arr, 20, 0, 9));
    Assertions.assertEquals(4, InterpolationSearch.interpolationSearch(arr, 47, 0, 9));
    Assertions.assertEquals(5, InterpolationSearch.interpolationSearch(arr, 69, 0, 9));
    Assertions.assertEquals(6, InterpolationSearch.interpolationSearch(arr, 75, 0, 9));
    Assertions.assertEquals(7, InterpolationSearch.interpolationSearch(arr, 80, 0, 9));
    Assertions.assertEquals(8, InterpolationSearch.interpolationSearch(arr, 85, 0, 9));
    Assertions.assertEquals(9, InterpolationSearch.interpolationSearch(arr, 90, 0, 9));
  }
}
