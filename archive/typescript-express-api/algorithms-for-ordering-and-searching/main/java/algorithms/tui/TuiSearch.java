package main.java.algorithms.tui;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.Searcher;
import main.java.algorithms.search.*;

import java.util.*;

public class TuiSearch {
  public static void tui(int choice, String input, int target){
    List<Integer> list = new ArrayList<>();

    if (!input.trim().isEmpty()) {
      for (String value : input.split(" "))
        list.add(Integer.parseInt(value));
    }


    if (list.isEmpty()) {
      Random random = new Random();
      list.add(target);
      while (list.size() < 10) {
        list.add(random.nextInt(100));
      }
      Collections.shuffle(list);
      System.out.println("Lista gerada aleatoriamente: " + list);
    }

    Searcher searcher;
    switch (choice) {
      case 1:
        searcher = new BinarySearch();
        break;
      case 2:
        searcher = new ExponentialSearch();
        break;
      case 3:
        searcher = new InterpolationSearch();
        break;
      case 4:
        searcher = new JumpSearch();
        break;
      case 5:
        searcher = new TernarySearch();
        break;
      default:
        System.out.println("Escolha inválida.");
        return;
    }
    Result result = searcher.search(list, target);
    if (result.list.isEmpty())
      System.out.println("Valor não encontrado.");
    else
      System.out.println("Valor encontrado na posição: " + result.list.getFirst());

    System.out.println(result.comparisons + " vezes que o algoritmo fez comparações");
  }

}
