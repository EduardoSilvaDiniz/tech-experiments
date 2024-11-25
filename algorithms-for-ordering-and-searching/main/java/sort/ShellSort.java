package main.java.sort;

import java.lang.Math;

public class ShellSort {

  private static final int N = 8;
  private static int[] lista = {1, 9, 6, 35, 2, 99, 8, 7};

  public static void main(String[] args) {
    for (int w = 0; w < N; w++) {
      System.out.print(lista[w] + " ");
    }
    System.out.println();

    shell(lista, N);

    for (int w = 0; w < N; w++) {
      System.out.print(lista[w] + " ");
    }
    System.out.println();
  }

  public static void shell(int[] lista, int tamanho) {
    int i, j, aux;
    double k = Math.log(tamanho + 1) / Math.log(3);
    k = Math.floor(k + 0.5);
    int h = (int) ((Math.pow(3, (int) k) - 1) / 2);

    while (h > 0) {
      for (i = h; i < tamanho; i++) {
        aux = lista[i];
        j = i;
        while (j >= h && lista[j - h] > aux) {
          lista[j] = lista[j - h];
          j -= h;
        }
        lista[j] = aux;
      }
      h = (h - 1) / 3;
    }
  }
}
