package main.java.search;

public class JumpSearch {
  public static int jumpSearch(int[] arr, int x)
  {
    int n = arr.length;

    int step = (int)Math.floor(Math.sqrt(n));

    int prev = 0;
    for (int minStep = Math.min(step, n)-1; arr[minStep] < x; minStep = Math.min(step, n)-1)
    {
      prev = step;
      step += (int)Math.floor(Math.sqrt(n));
      if (prev >= n)
        return -1;
    }

    while (arr[prev] < x)
    {
      prev++;

      if (prev == Math.min(step, n))
        return -1;
    }

    if (arr[prev] == x)
      return prev;

    return -1;
  }
}
