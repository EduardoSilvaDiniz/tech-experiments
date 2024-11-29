package test.java.sort;

import main.java.sort.BubbleSort;
import main.java.sort.ShellSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShellSortUnitTest {

  @Test
  public void shellSortTest(){
    int[] list = {9,10,6,21,4,1,14};
    int[] listOrder = {1,4,6,9,10,14,21};
    ShellSort.sort(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
}
