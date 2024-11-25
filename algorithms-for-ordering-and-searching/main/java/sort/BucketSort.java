package main.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {

    private static final int BUCKET_SIZE = 10; // Número de baldes

    // Função para ordenar um balde usando a ordenação por inserção
    private static void insertionSort(ArrayList<Float> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            float key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
    }

    // Função para realizar o Bucket Sort
    public static void bucketSort(float[] arr) {
        // Criar baldes
        ArrayList<Float>[] buckets = new ArrayList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Distribuir os elementos nos baldes
        for (float v : arr) {
            int bucketIndex = (int) (v * BUCKET_SIZE); // Calcular o índice do balde
            if (bucketIndex >= BUCKET_SIZE) {
                bucketIndex = BUCKET_SIZE - 1; // Garantir que o índice não exceda o tamanho do balde
            }
            buckets[bucketIndex].add(v); // Adicionar o elemento ao balde
        }

        // Ordenar cada balde e concatenar os resultados
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            if (!bucket.isEmpty()) {
                insertionSort(bucket); // Ordenar o balde
                for (float v : bucket) {
                    arr[index++] = v; // Concatenar os elementos ordenados
                }
            }
        }
    }

    // Função para imprimir um array
    private static void printArray(float[] arr) {
        for (float v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que você deseja ordenar: ");
        int n = scanner.nextInt();

        // Alocar memória para o array
        float[] arr = new float[n];

        // Ler os números do usuário
        System.out.println("Digite os números (no intervalo [0, 1)): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }

        System.out.print("Array original: ");
        printArray(arr);

        bucketSort(arr);

        System.out.print("Array ordenado: ");
        printArray(arr);

        scanner.close();
    }
}