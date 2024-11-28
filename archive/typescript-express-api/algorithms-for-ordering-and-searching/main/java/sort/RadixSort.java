package main.java.sort;

public class RadixSort {

  public static int getMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static void countingSortAsc(int[] array, int place) {
    int n = array.length;
    int[] output = new int[n];
    int[] count = new int[10];

    for (int i = 0; i < n; i++) {
      int index = (array[i] / place) % 10;
      count[index]++;
    }

    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    for (int i = n - 1; i >= 0; i--) {
      int index = (array[i] / place) % 10;
      output[count[index] - 1] = array[i];
      count[index]--;
    }

    System.arraycopy(output, 0, array, 0, n);
  }

  public static void countingSortDesc(int[] array, int place) {
    int n = array.length;
    int[] output = new int[n];
    int[] count = new int[10];

    for (int i = 0; i < n; i++) {
      int index = (array[i] / place) % 10;
      count[index]++;
    }

    for (int i = 8; i >= 0; i--) {
      count[i] += count[i + 1];
    }

    for (int i = n - 1; i >= 0; i--) {
      int index = (array[i] / place) % 10;
      output[count[index] - 1] = array[i];
      count[index]--;
    }

    System.arraycopy(output, 0, array, 0, n);
  }

  public static void radixSortAsc(int[] array) {
    int maxElement = getMax(array);

    for (int place = 1; maxElement / place > 0; place *= 10) {
      countingSortAsc(array, place);
    }
  }

  public static void radixSortDesc(int[] array) {
    int maxElement = getMax(array);

    for (int place = 1; maxElement / place > 0; place *= 10) {
      countingSortDesc(array, place);
    }
  }
}