package test.java.sort;

import main.java.sort.RadixSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadixSortUnitTest {

  @Test
  public void radixSortTestAsc(){
    int[] list = {9,10,6,21,4,1,14};
    int[] listOrder = {1,4,6,9,10,14,21};
    RadixSort.radixSortAsc(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
  @Test
  public void radixSortTestDesc(){
    int[] list = {9,10,6,21,4,1,14};
    int[] listOrder = {21,14,10,9,6,4,1};

    RadixSort.radixSortDesc(list);

    Assertions.assertEquals(listOrder[0],list[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],list[list.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],list[list.length-1]);
  }
}
