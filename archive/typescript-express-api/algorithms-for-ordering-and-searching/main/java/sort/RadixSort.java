package main.java.sort;

public class RadixSort {
  public static int getMax(int[] list) {
    int max = list[0];
    for (int i = 1; i < list.length; i++) {
      if (list[i] > max) {
        max = list[i];
      }
    }
    return max;
  }

  public static void countingSortAsc(int[] list, int place) {
    int length = list.length;
    int[] output = new int[length];
    int[] count = new int[10];

    for (int j : list) {
      int index = (j / place) % 10;
      count[index]++;
    }

    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];


    for (int i = length - 1; i >= 0; i--) {
      int index = (list[i] / place) % 10;
      output[count[index] - 1] = list[i];
      count[index]--;
    }

    System.arraycopy(output, 0, list, 0, length);
  }

  public static void countingSortDesc(int[] list, int place) {
    int length = list.length;
    int[] output = new int[length];
    int[] count = new int[10];

    for (int j : list) {
      int index = (j / place) % 10;
      count[index]++;
    }

    for (int i = 8; i >= 0; i--)
      count[i] += count[i + 1];


    for (int i = length - 1; i >= 0; i--) {
      int index = (list[i] / place) % 10;
      output[count[index] - 1] = list[i];
      count[index]--;
    }

    System.arraycopy(output, 0, list, 0, length);
  }

  public static void radixSortAsc(int[] list) {
    int maxElement = getMax(list);

    for (int place = 1; maxElement / place > 0; place *= 10)
      countingSortAsc(list, place);
  }

  public static void radixSortDesc(int[] list) {
    int maxElement = getMax(list);

    for (int place = 1; maxElement / place > 0; place *= 10)
      countingSortDesc(list, place);
  }
}