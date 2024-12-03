package test.java.algorithms.sort;

import main.java.algorithms.base.GenerateList;
import main.java.algorithms.base.Result;
import main.java.algorithms.base.Sorter;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultTest {
  public static void bigListAndShowComparetionAndTime(Sorter sorter){
    List<Integer> sizes = Arrays.asList(1000, 3000, 6000, 8000, 10000);
    GenerateList generateList = new GenerateList();
    List<Integer> expected = new ArrayList<>();
    List<Integer> unsorted = new ArrayList<>();
    long startTime, endTime;
    Result actual;

    for (Integer size : sizes) {
      unsorted.clear();
      expected.clear();

      unsorted.addAll(generateList.generateRandomList(size));
      expected.addAll(unsorted);

      startTime = System.nanoTime();
      actual = sorter.sort(unsorted);
      endTime = System.nanoTime();

      Collections.sort(expected);

      Assertions.assertEquals(expected, actual.list);
      System.out.println(
          actual.comparisons
              + " Vezes que o algoritmo fez comparações"
              + " tempo em milesegundos "
              + (endTime - startTime) / 1_000_000);
    }
  }
}
