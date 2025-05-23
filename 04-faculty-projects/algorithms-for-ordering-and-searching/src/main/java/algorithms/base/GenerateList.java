package main.java.algorithms.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateList {
  public List<Integer> generateSortedList(int size) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= size; i++) list.add(i);

    return list;
  }

  public List<Integer> generateRandomList(int size) {
    List<Integer> list = new ArrayList<>();
    Random random = new Random(19700621);
    for (int i = 0; i < size; i++) list.add(random.nextInt(10001));

    return list;
  }
}
