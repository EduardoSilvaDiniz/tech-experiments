package main.java;

import main.java.search.BinarySearch;
import main.java.search.ExponentialSearch;
import main.java.sort.SelectionSort;

public class Main {
  public static void main(String[] args) {
    int[] listsort = {23,91,4,81,2,51,21,10,102};
    SelectionSort.selectionSort(listsort, 1);
  }
}