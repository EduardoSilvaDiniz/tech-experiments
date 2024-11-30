package main.java.algorithms.tui;

public class ShowMenu {
  public static void startMenu() {
    System.out.println("Menu:");
    System.out.println("1. Pesquisar um valor");
    System.out.println("2. Ordernar uma lista");
    System.out.println("0. Sair");
    System.out.print("Escolha uma opção: ");
  }

  public static void searchMenu() {
    System.out.println("Escolha um algoritmo de busca:");
    System.out.println("1. Binary Search");
    System.out.println("2. Exponential Search");
    System.out.println("3. Interpolation Search");
    System.out.println("4. Jump Search");
    System.out.println("5. Ternary Search");
  }

  public static void sortMenu() {
    System.out.println("Escolha um algoritmo de ordenação:");
    System.out.println("1. BubbleSort");
    System.out.println("2. BucketSort");
    System.out.println("3. InsertionSort");
    System.out.println("4. MergeSort");
    System.out.println("5. QuickSort");
    System.out.println("6. RadixSort");
    System.out.println("7. SelectionSort");
    System.out.println("8. ShellSort");
    System.out.print("Digite o número do algoritmo desejado: ");
  }
}
