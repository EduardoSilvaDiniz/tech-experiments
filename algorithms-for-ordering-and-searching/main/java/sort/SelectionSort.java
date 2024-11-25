package main.java.sort;

public class SelectionSort {
  public static void selectionSort(int[] list, int ordenacao) {
    if (ordenacao == 1) {
      for (int i = 0; i < list.length - 1; i++) {
        int numeroMinimo = i;
        numeroMinimo = buscaMenorValor(i, numeroMinimo, list);
        trocaPosicaoDoNumero(i, numeroMinimo, list);
        imprimeVetor(list);
      }
    } else {
      for (int i = 0; i < list.length - 1; i++) {
        int numeroMaximo = i;
        numeroMaximo = buscaMaiorValor(i, numeroMaximo, list);
        trocaPosicaoDoNumero(i, numeroMaximo, list);
        imprimeVetor(list);
      }
    }
  }

  private static void trocaPosicaoDoNumero(int indiceAtual, int indiceDoNumeroParaTroca, int[] list) {
    if (indiceAtual != indiceDoNumeroParaTroca) {
      int auxiliar = list[indiceAtual];
      list[indiceAtual] = list[indiceDoNumeroParaTroca];
      list[indiceDoNumeroParaTroca] = auxiliar;
    }
  }

  private static int buscaMaiorValor(int indiceAtual, int numeroMaximo, int[] list) {
    for (int indiceDeComparacao = indiceAtual + 1; indiceDeComparacao < list.length; indiceDeComparacao++) {
      if (list[indiceDeComparacao] > list[numeroMaximo]) {
        numeroMaximo = indiceDeComparacao;
      }
    }
    return numeroMaximo;
  }

  private static int buscaMenorValor(int indiceAtual, int numeroMinimo, int[] list) {
    for (int indiceDeComparacao = indiceAtual + 1; indiceDeComparacao < list.length; indiceDeComparacao++) {
      if (list[indiceDeComparacao] < list[numeroMinimo]) {
        numeroMinimo = indiceDeComparacao;
      }
    }
    return numeroMinimo;
  }

  private static void imprimeVetor(int[] list) {
    for (int j : list) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

}
