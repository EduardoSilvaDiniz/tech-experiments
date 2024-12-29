package main.java.plotting;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import main.java.algorithms.base.Searcher;

public class ColectionTime {
  public static HashMap<String, List<Long>> colectionSearchTime() {
    HashMap<String, List<Long>> executionTimes = new HashMap<>();
    List<Integer> sizes = List.of(1000, 3000, 6000, 8000, 10000);
    List<String> algorithms =
        List.of(
            "main.java.algorithms.search.BinarySearch",
            "main.java.algorithms.search.ExponentialSearch",
            "main.java.algorithms.search.InterpolationSearch",
            "main.java.algorithms.search.JumpSearch",
            "main.java.algorithms.search.TernarySearch");

    Random random = new Random();

    for (String algorithm : algorithms) {
      try {
        Class<?> clazz = Class.forName(algorithm);
        Searcher searcher = (Searcher) clazz.getDeclaredConstructor().newInstance();
        List<Long> times = new ArrayList<>();

        for (int size : sizes) {
          List<Integer> list = new ArrayList<>();
          for (int j = 0; j < size; j++) list.add(j);

          Integer target = random.nextInt(size);
          long startTime = System.nanoTime();
          searcher.search(list, target);
          long endTime = System.nanoTime();
          times.add(endTime - startTime);
        }

        String algorithmName = algorithm.substring(algorithm.lastIndexOf('.') + 1);
        executionTimes.put(algorithmName, times);
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
