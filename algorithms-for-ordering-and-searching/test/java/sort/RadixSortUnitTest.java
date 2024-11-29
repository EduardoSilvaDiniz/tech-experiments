package test.java.sort;

import main.java.algorithms.sort.RadixSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadixSortUnitTest {

  @Test
  public void radixSortTestAsc(){
    int[] list = {80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15};
    int[] listOrder = {0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602};
    RadixSort.radixSortAsc(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
  @Test
  public void radixSortTestDesc(){
    int[] list = {80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15};
    int[] listOrder = {602, 600, 500, 200, 80, 70, 60, 50, 40, 30, 20, 15, 10 ,0};

    RadixSort.radixSortDesc(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
}
