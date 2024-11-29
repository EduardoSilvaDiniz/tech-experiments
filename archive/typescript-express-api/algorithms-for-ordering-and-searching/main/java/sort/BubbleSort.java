package main.java.sort;

public class BubbleSort {
  public static int[] sort(int[] list) {
    int aux;

    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list.length - 1; j++) {
        if (list[j] > list[j + 1]) {
          aux = list[j];
          list[j] = list[j + 1];
          list[j + 1] = aux;
        }
      }
    }
    return list;
  }
}

