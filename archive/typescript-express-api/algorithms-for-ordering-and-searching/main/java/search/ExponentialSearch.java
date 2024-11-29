package main.java.search;

public class ExponentialSearch {

  public static int search(int[] list, int value) {
    if (list.length == 0)
      throw new IllegalArgumentException("empty list");

    if (list.length == 1)
      return list[0];

    int listSize = list.length - 1;
    int exponentialValue = 1;

    while (exponentialValue < listSize && list[exponentialValue] < value)
      exponentialValue *= 2;

    return BinarySearch.search(list, value, exponentialValue / 2, Math.min(exponentialValue, listSize));
  }
}