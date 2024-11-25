package main.java.search;

public class BinarySearch {

  public static int binarySearch(int[] list, int value, int low, int high) {
    if (list.length == 0)
      throw new IllegalArgumentException("empty list");

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (list[mid] == value)
        return mid;
      if (list[mid] < value)
        low = mid + 1;
      else
        high = mid - 1;
    }

    throw new IllegalArgumentException("value not found");
  }

  public static int binarySearch(int[] list, int value) {
    if (list.length == 0)
      throw new IllegalArgumentException("empty list");

    int low = 0;
    int high = list.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (list[mid] == value)
        return mid;
      if (list[mid] < value)
        low = mid + 1;
      else
        high = mid - 1;
    }

    throw new IllegalArgumentException("value not found");
  }
}
