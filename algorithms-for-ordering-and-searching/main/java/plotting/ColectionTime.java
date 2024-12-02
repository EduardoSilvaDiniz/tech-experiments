package main.java.plotting;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import main.java.algorithms.base.Searcher;

public class ColectionTime {
  public static HashMap<String, List<Long>> colectionSearchTime() {
    HashMap<String, List<Long>> executionTimes = new HashMap<>();
    executionTimes.put("BinarySearch", new ArrayList<>());
    executionTimes.put("ExponentialSearch", new ArrayList<>());
    executionTimes.put("InterpolationSearch", new ArrayList<>());
    executionTimes.put("JumpSearch", new ArrayList<>());
    executionTimes.put("TernarySearch", new ArrayList<>());

    List<Integer> list = new ArrayList<>();
    int[] sizes = {100, 1000, 10000};
    List<String> algorithms =
        Arrays.asList(
            "main.java.algorithms.search.BinarySearch",
            "main.java.algorithms.search.ExponentialSearch",
            "main.java.algorithms.search.InterpolationSearch",
            "main.java.algorithms.search.JumpSearch",
            "main.java.algorithms.search.TernarySearch");
    Integer target = 50;

    for (String algorithm : algorithms) {
      try {
        Class<?> clazz = Class.forName(algorithm);
        Searcher searcher = (Searcher) clazz.getDeclaredConstructor().newInstance();
        for (int i = 0; i < 3; i++) {
          for (int size : sizes) {
            for (int j = 0; j < size; j++) list.add(j);
            long startTime = System.nanoTime();
            searcher.search(list, target);
            long endTime = System.nanoTime();
            int lastIndexOf = algorithm.lastIndexOf('.');
            if (lastIndexOf != -1 ){
              String lastWord = algorithm.substring(lastIndexOf + 1);
              executionTimes.get(lastWord).add(endTime - startTime);
            } else throw new IndexOutOfBoundsException("last index not found");
          }
        }
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
