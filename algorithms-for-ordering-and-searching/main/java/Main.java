package main.java;

import main.java.algorithms.tui.ShowMenu;
import main.java.algorithms.tui.TuiSearch;
import main.java.algorithms.tui.TuiSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer choice, target;
    String input;

    do {
      ShowMenu.startMenu();
      choice = Integer.parseInt(in.readLine());
      switch (choice) {
        case 1:
          ShowMenu.searchMenu();
          choice = Integer.parseInt(in.readLine());
          System.out.println("Digite os valores da lista (separados por espaço):");
          input = in.readLine();
          System.out.println("Digite o valor a ser procurado:");
          target = Integer.parseInt(in.readLine());
          TuiSearch.tui(choice, input, target);
          break;
        case 2:
          ShowMenu.sortMenu();
          choice = Integer.parseInt(in.readLine());
          System.out.print("Digite os valores a serem ordenados (separados por espaço): ");
          input = in.readLine();
          TuiSort.tui(choice, input);
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (choice != 0);
  }
}








