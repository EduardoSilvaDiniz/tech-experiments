package main.java.algorithms.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingAndSortingStrings {

  public static void mergeSortStrings(List<String> arr) {
    List<String> listLeft = new ArrayList<>();
    List<String> listRight = new ArrayList<>();
    int i = 0, j = 0, k = 0;


    if (arr.size() > 1) {
      int mid = arr.size() / 2;
      listLeft = arr.subList(0, mid);
      listRight = arr.subList(mid, arr.size());

      mergeSortStrings(listLeft);
      mergeSortStrings(listRight);

      while (i < listLeft.size() && j < listRight.size()) {
        if (listLeft.get(i).compareToIgnoreCase(listRight.get(j)) < 0) {
          arr.set(k, listLeft.get(i));
          i++;
        } else {
          arr.set(k, listLeft.get(j));
          j++;
        }
        k++;
      }

      while (i < listLeft.size()) {
        arr.set(k, listLeft.get(i));
        i++;
        k++;
      }

      while (j < listRight.size()) {
        arr.set(k, listRight.get(j));
        j++;
        k++;
      }
    }
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
    return -1;
  }
}