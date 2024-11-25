package main.java.search;

public class TernarySearch {
  public static int ternarySearch(int[] list, int value, int left, int right) {
    if (left <= right) {
      int mid = left + (right - left) / 3;
      int secondMid = right - (right - left) / 3;

      if (list[mid] == value)
        return mid;

      if (list[secondMid] == value)
        return secondMid;


      if (value < list[mid])
        return ternarySearch(list, left, mid - 1, value);
      else if (value > list[secondMid])
        return ternarySearch(list, secondMid + 1, right, value);
      else
        return ternarySearch(list, mid + 1, secondMid - 1, value);

    }
    throw new IllegalArgumentException("value not found");
  }
}