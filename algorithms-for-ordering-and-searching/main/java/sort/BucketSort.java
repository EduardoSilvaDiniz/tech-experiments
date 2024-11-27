package main.java.sort;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
  //TODO erro com os tipos de dados e indexexception
  private static void insertionSort(List<Integer> arr) {
    for (int i = 1; i < arr.size(); i++) {
      int key = arr.get(i);
      int j = i - 1;
      while (j >= 0 && arr.get(j) > key) {
        arr.set(j + 1, arr.get(j));
        j--;
      }
      arr.set(j + 1, key);
    }
  }

  public static void bucketSort(int[] arr) {
    int n = arr.length-2;
    List<Integer>[] buckets = new ArrayList[n];

    for (int i = 0; i < n; i++)
      buckets[i] = new ArrayList<>();

    for (int v : arr) {
      int bi = (int) (n * v);
      buckets[bi].add(v);
    }

    for (int i = 0; i < n; i++)
      insertionSort(buckets[i]);

    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < buckets[i].size(); j++)
        arr[index++] = buckets[i].get(j);
    }
  }
}
