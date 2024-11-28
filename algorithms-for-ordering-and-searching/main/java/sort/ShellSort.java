package main.java.sort;

import java.lang.Math;

public class ShellSort {
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
