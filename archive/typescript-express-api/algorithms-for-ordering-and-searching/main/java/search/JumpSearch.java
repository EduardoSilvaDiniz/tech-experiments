package main.java.search;

public class JumpSearch {
  public static int search(int[] list, int value) {
    int length = list.length;

    int step = (int) Math.floor(Math.sqrt(length));

    int prev = 0;
    for (int minStep = Math.min(step, length) - 1; list[minStep] < value; minStep = Math.min(step, length) - 1) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(length));
      if (prev >= length)
        return -1;
    }

    while (list[prev] < value) {
      prev++;

      if (prev == Math.min(step, length))
        return -1;
    }

    if (list[prev] == value)
      return prev;

    throw new IllegalArgumentException("Value not found");
  }
}