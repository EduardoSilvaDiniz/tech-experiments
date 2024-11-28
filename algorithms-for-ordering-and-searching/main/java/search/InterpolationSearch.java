package main.java.search;

public class InterpolationSearch {
  public static int interpolationSearch(int[] list, int value, int low, int high) {
    if (low <= high && value >= list[low] && value <= list[high]) {
      int mid = low + ((value - list[low]) * (high - low) / (list[high] - list[low]));

      if (list[mid] == value) return mid;

      if (list[mid] > value) return interpolationSearch(list, value, low, mid - 1);

      return interpolationSearch(list, value, mid + 1, high);
    }
    throw new IllegalArgumentException("value not found");
  }
}
