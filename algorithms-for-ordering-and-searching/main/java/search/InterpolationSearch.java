package main.java.search;

import java.util.Scanner;

public class InterpolationSearch {

    // Método para realizar a busca interpolada
    public static int buscaInterpolada(int[] arr, int chave, int inicio, int fim) {
        if (inicio <= fim && chave >= arr[inicio] && chave <= arr[fim]) {
            int meio = inicio + ((chave - arr[inicio]) * (fim - inicio) / (arr[fim] - arr[inicio]));

            if (arr[meio] == chave) {
                return meio; // Retorna o índice se a chave for encontrada
            }

            if (arr[meio] > chave) {
                return buscaInterpolada(arr, chave, inicio, meio - 1); // Busca na metade esquerda
            }

            return buscaInterpolada(arr, chave, meio + 1, fim); // Busca na metade direita
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }

    public static void main(String[] args) {
        int[] arr = {13, 14, 16, 20, 47, 69, 75, 80, 85, 90};
        Scanner scanner = new Scanner(System.in);
        int valor, op;

        do {
            System.out.print("Digite o valor a ser buscado: ");
            valor = scanner.nextInt();
            int resultado = buscaInterpolada(arr, valor, 0, arr.length - 1);
            if (resultado != -1) {
                System.out.printf("\nResultado: %d encontrado na posição %d\n", valor, resultado);
            } else {
                System.out.printf("\nResultado: %d não encontrado\n", valor);
            }

            System.out.print("\n0 - Sair\n1 - Nova busca\n");
            op = scanner.nextInt();
        } while (op != 0);

        scanner.close(); // Fecha o scanner
    }
}
