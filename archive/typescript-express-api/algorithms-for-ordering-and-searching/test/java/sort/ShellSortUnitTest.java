package test.java.sort;

import main.java.algorithms.sort.ShellSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShellSortUnitTest {

  @Test
  public void shellSortTest(){
    int[] list = {80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15};
    int[] listOrder = {0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602};
    ShellSort.sort(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
}
