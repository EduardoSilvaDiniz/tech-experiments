package main.java.algorithms.challenge;

import org.junit.jupiter.params.aggregator.ArgumentAccessException;

import java.util.ArrayList;
import java.util.List;

public class SearchingAndSortingStrings {

  public static List<String> mergeSortStrings(List<String> arr) {
    if (arr.size() <= 1) return new ArrayList<>(arr);

    int mid = arr.size() / 2;
    List<String> listLeft = mergeSortStrings(arr.subList(0, mid));
    List<String> listRight = mergeSortStrings(arr.subList(mid, arr.size()));

    return merge(listLeft, listRight);
  }

  public static List<String> merge(List<String> left, List<String> right) {
    List<String> merged = new ArrayList<>();
    int i = 0, j = 0;

    while (i < left.size() && j < right.size()) {
      if (left.get(i).compareToIgnoreCase(right.get(j)) < 0) {
        merged.add(left.get(i));
        i++;
      } else {
        merged.add(right.get(j));
        j++;
      }
    }

    while (i < left.size()) {
      merged.add(left.get(i));
      i++;
    }

    while (j < right.size()) {
      merged.add(right.get(j));
      j++;
    }

    return merged;
  }

  public static List<String> quickSortStrings(List<String> arr) {
    if (arr.size() <= 1) return arr;

    String pivot = arr.get(arr.size() / 2);
    List<String> left = new ArrayList<>();
    List<String> right = new ArrayList<>();
    List<String> equal = new ArrayList<>();

    for (String word : arr) {
      if (word.equalsIgnoreCase(pivot)) equal.add(word);
      else if (word.compareToIgnoreCase(pivot) < 0) left.add(word);
      else right.add(word);
    }

    List<String> sortedList = new ArrayList<>();
    sortedList.addAll(quickSortStrings(left));
    sortedList.addAll(equal);
    sortedList.addAll(quickSortStrings(right));
    return sortedList;
  }

  public static int binarySearchStrings(List<String> arr, String target) {
    int low = 0;
    int high = arr.size() - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int comparison = arr.get(mid).compareToIgnoreCase(target);

      if (comparison == 0) return mid;
      else if (comparison < 0) low = mid + 1;
      else high = mid - 1;
    }
    throw new ArgumentAccessException("word not found");
  }
}
