package test.java.algorithms.search;

import main.java.algorithms.search.ExponentialSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentialSearchUnitTest {

  @Test
  public void testBinarySearch() {
    int[] list = {13, 14, 16, 20, 47, 69, 75, 80, 85, 90};

    /*
    assertEquals(0, ExponentialSearch.search(list, 1));
    assertEquals(1, ExponentialSearch.search(list, 2));
    assertEquals(2, ExponentialSearch.search(list, 3));
    assertEquals(3, ExponentialSearch.search(list, 4));
    assertEquals(4, ExponentialSearch.search(list, 5));
    assertEquals(5, ExponentialSearch.search(list, 6));
    assertEquals(6, ExponentialSearch.search(list, 7));

     */
  }

  private ExponentialSearch searched;

  @BeforeEach
  public void setUp() {
    searched = new ExponentialSearch();
  }

  @Test
  public void exponentialSearchTest() {
    List<Integer> list = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);

    for (int i = 0; i < list.size(); i++)
      Assertions.assertEquals(i, searched.search(list, list.get(i)).list.getFirst());

  }
}