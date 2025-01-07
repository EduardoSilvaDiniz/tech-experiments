package main.java.algorithms.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGradeSearch {
  public static List<Integer> bucketSort(List<Integer> arr) {
    if (arr.isEmpty()) return arr;

    List<Integer> sortedArr = new ArrayList<>();
    List<List<Integer>> buckets = new ArrayList<>();
    int bucketCount = arr.size();
    int maxValue = Collections.max(arr);
    int minValue = Collections.min(arr);
    double bucketRange = (double) (maxValue - minValue) / bucketCount + 1;

    for (int i = 0; i < bucketCount; i++) buckets.add(new ArrayList<>());

    for (int num : arr) {
      int index = (int) ((num - minValue) / bucketRange);
      buckets.get(index).add(num);
    }

    for (List<Integer> bucket : buckets) {
      Collections.sort(bucket);
      sortedArr.addAll(bucket);
    }
    return sortedArr;
  }

  public static int interpolationSearch(List<Integer> arr, int target) {
    int low = 0;
    int high = arr.size() - 1;

    while (low <= high && target >= arr.get(low) && target <= arr.get(high)) {
      if (low == high) {
        if (arr.get(low) == target) return low;
        return -1;
      }

      int pos = low + ((target - arr.get(low)) * (high - low) / (arr.get(high) - arr.get(low)));

      if (arr.get(pos) == target) return pos;
      if (arr.get(pos) < target) low = pos + 1;
      else high = pos - 1;
    }
    return -1;
  }
}