package test.java.search;

import main.java.sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
  @Test
  public void bubbleSortTest(){
    int[] list = {9,10,6,21,4,1,14};
    int[] listorder = {1,4,6,9,10,14,21};
    int[] listSort = BubbleSort.bubbleSort(list);

    Assertions.assertEquals(listorder[0],listSort[0]);
    Assertions.assertEquals(listorder[listorder.length/2],listSort[listSort.length/2]);
    Assertions.assertEquals(listorder[listorder.length-1],listSort[listSort.length-1]);
  }
}
