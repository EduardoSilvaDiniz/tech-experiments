package main.java.plotting;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.java.algorithms.base.Searcher;

public class ColectionTime {
  public static List<Long> colectionSearchTime() {
    List<Long> executionTimes = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    List<String> algorithms =
        Arrays.asList(
            "main.java.algorithms.search.BinarySearch",
            "main.java.algorithms.search.ExponentialSearch",
            "main.java.algorithms.search.InterpolationSearch",
            "main.java.algorithms.search.JumpSearch",
            "main.java.algorithms.search.TernarySearch");
    Integer target = 50;

    for (int i = 1; i <= 100; i++) list.add(i);

    for (String algorithm : algorithms) {
      try {
        Class<?> clazz = Class.forName(algorithm);
        Searcher searcher = (Searcher) clazz.getDeclaredConstructor().newInstance();
        long startTime = System.nanoTime();
        searcher.search(list, target);
        long endTime = System.nanoTime();
        executionTimes.add(endTime - startTime);
      } catch (ClassNotFoundException e) {
        System.out.println("Classe não encontrada: " + algorithm);
      } catch (InstantiationException
          | IllegalAccessException
          | NoSuchMethodException
          | InvocationTargetException e) {
        e.printStackTrace();
      }
    }

    return executionTimes;
  }
}
