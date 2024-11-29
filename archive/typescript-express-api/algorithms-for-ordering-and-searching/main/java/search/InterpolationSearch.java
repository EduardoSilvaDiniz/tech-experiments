package main.java.search;

public class InterpolationSearch {
  public static int search(int[] list, int value) {
    int low = 0;
    int high = list.length - 1;

    if (low <= high && value >= list[low] && value <= list[high]) {
      int mid = low + ((value - list[low]) * (high - low) / (list[high] - list[low]));

      if (list[mid] == value) return mid;

      if (list[mid] > value) return search(list, value, low, mid - 1);

      return search(list, value, mid + 1, high);
    }
    throw new IllegalArgumentException("value not found");
  }

  private static int search(int[] list, int value, int low, int high) {
    if (low <= high && value >= list[low] && value <= list[high]) {
      int mid = low + ((value - list[low]) * (high - low) / (list[high] - list[low]));

      if (list[mid] == value) return mid;

      if (list[mid] > value) return search(list, value, low, mid - 1);

      return search(list, value, mid + 1, high);
    }
    throw new IllegalArgumentException("value not found");
  }
}
