package main.java.algorithms.tui;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.Sorter;
import main.java.algorithms.sort.*;

import java.util.ArrayList;
import java.util.List;

public class TuiSort {
  public static void tui(Integer choice, String input){
    List<Integer> list = new ArrayList<>();

    String[] values = input.split(" ");
    //TODO é exatamente a mesma coisa no TuiSearch, tente reaproveitar
    for (String value : values)
      list.add(Integer.parseInt(value));


    Sorter sorter;
    switch (choice) {
      case 1:
        sorter = new BubbleSort();
        break;
      case 2:
        sorter = new BucketSort();
        break;
      case 3:
        sorter = new InsertionSort();
        break;
      case 4:
        sorter = new MergeSort();
        break;
      case 5:
        sorter = new QuickSort();
        break;
      case 6:
        sorter = new RadixSort();
        break;
      case 7:
        sorter = new SelectionSort();
        break;
      case 8:
        sorter = new ShellSort();
        break;
      default:
        System.out.println("Opção inválida.");
        return;
    }
    Result actual = sorter.sort(list);

    System.out.println("Lista ordenada: " + actual.list);
    System.out.println(actual.comparisons + " vezes que o algoritmo fez comparações");
  }
}
