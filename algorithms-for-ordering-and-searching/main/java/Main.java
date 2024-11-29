package main.java;

import main.java.sort.BubbleSort;

import java.util.stream.IntStream;


public class Main {
  public static void main(String[] args) {
    int[] listDesord = {9, 10, 6, 21, 4, 1, 14};
    int[] list = IntStream.range(1, 1000).toArray();
    long inicio = System.currentTimeMillis();

    BubbleSort.sort(list);

    long fim = System.currentTimeMillis();
    long tempoExecucao = fim - inicio;
    System.out.println("Tempo de execução: " + tempoExecucao + " milissegundos");
  }
}