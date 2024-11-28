package main.java.sort;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;


public class BubbleSort {
  @Benchmark
  @BenchmarkMode(Mode.AverageTime)
  public static int[] bubbleSort(int[] list) {
    int aux = 0;

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

