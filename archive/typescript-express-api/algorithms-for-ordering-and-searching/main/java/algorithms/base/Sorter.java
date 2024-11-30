package main.java.algorithms.base;

import java.util.List;

public interface Sorter<T> {
  Result sort(List<T> arrayToSort);
}
