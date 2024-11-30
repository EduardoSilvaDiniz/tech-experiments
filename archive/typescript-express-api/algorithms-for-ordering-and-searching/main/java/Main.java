package main.java;

import main.java.algorithms.tui.ShowMenu;
import main.java.algorithms.tui.TuiSearch;
import main.java.algorithms.tui.TuiSort;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice, target;
    String input;

    do {
      ShowMenu.startMenu();
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          ShowMenu.searchMenu();
          choice = scanner.nextInt();
          System.out.println("Digite os valores da lista (separados por espaço):");
          input = scanner.nextLine();
          System.out.println("Digite o valor a ser procurado:");
          target = scanner.nextInt();
          TuiSearch.tui(choice, input, target);
        case 2:
          ShowMenu.sortMenu();
          choice = scanner.nextInt();
          System.out.print("Digite os valores a serem ordenados (separados por espaço): ");
          input = scanner.nextLine();
          TuiSort.tui(choice, input);
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (choice != 0);
  }
}








