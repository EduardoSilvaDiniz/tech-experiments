package main.java.algorithms.sort;

public class QuickSort {
  public static void sort(int[] list) {
    int begin = 0;
    int end = list.length-1;

    if (begin < end) {
      int partitionIndex = partition(list, begin, end);

      sort(list, begin, partitionIndex - 1);
      sort(list, partitionIndex + 1, end);
    }
  }

  private static void sort(int[] list, int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(list, begin, end);

      sort(list, begin, partitionIndex - 1);
      sort(list, partitionIndex + 1, end);
    }
  }

  private static int partition(int[] list, int begin, int end) {
    int pivot = list[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (list[j] <= pivot) {
        i++;

        int swapTemp = list[i];
        list[i] = list[j];
        list[j] = swapTemp;
      }
    }

    int swapTemp = list[i + 1];
    list[i + 1] = list[end];
    list[end] = swapTemp;

    return i + 1;
  }
}
