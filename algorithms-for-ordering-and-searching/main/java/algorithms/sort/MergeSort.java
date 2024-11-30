package main.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SortingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends SortingAlgorithm {
  public Result sort(List<Integer> list) {
    mergeSort(list, list.size());
    return new Result(list, comparisonCount);
  }

  private void mergeSort(List<Integer> listToOrder, int size) {
    if (size < 2)
      return;
    int sizeMid = size / 2;
    List<Integer> listLeft = new ArrayList<>(sizeMid);
    List<Integer> listRight = new ArrayList<>(size - sizeMid);

    for (int i = 0; i < sizeMid; i++) {
      listLeft.add(listToOrder.get(i));
    }

    for (int i = sizeMid; i < listToOrder.size(); i++) {
      listRight.add(listToOrder.get(i));
    }

    mergeSort(listLeft, sizeMid);
    mergeSort(listRight, size - sizeMid);

    merge(listToOrder, listLeft, listRight);
  }

  public void merge(List<Integer> listToOrder, List<Integer> listLeft, List<Integer> listRight) {
    int i = 0, j = 0, k = 0;
    int sizeLeft = listLeft.size(), sizeRight = listRight.size();

    while (i < sizeLeft && j < sizeRight) {
      if (listLeft.get(i) <= listRight.get(j)) {
        incrementComparisonCount();
        listToOrder.set(k++, listLeft.get(i++));
      } else {
        incrementComparisonCount();
        listToOrder.set(k++, listRight.get(j++));
      }
    }

    while (i < sizeLeft)
      listToOrder.set(k++, listLeft.get(i++));

    while (j < sizeRight)
      listToOrder.set(k++, listRight.get(j++));
  }
}