package test.java.sort;

import main.java.sort.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortUnitTest {
  @Test
  public void insertionSortTest(){
    int[] list = {9,10,6,21,4,1,14};
    int[] listOrder = {1,4,6,9,10,14,21};
    int[] listSort = InsertionSort.sort(list);

    Assertions.assertEquals(listOrder[0],listSort[0]);
    Assertions.assertEquals(listOrder[listOrder.length/2],listSort[listSort.length/2]);
    Assertions.assertEquals(listOrder[listOrder.length-1],listSort[listSort.length-1]);
  }
}
