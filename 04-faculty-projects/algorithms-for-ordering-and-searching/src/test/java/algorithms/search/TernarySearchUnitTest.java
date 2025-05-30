package test.java.algorithms.search;

import main.java.algorithms.search.TernarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TernarySearchUnitTest {
  private TernarySearch searched;

  @BeforeEach
  public void setUp() {
    searched = new TernarySearch();
  }

  @Test
  public void ternarySearchTest() {
    List<Integer> list = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);

    for (int i = 0; i < list.size(); i++)
      Assertions.assertEquals(i, searched.search(list, list.get(i)).list.getFirst());
  }
}
