package main.java;

import main.java.search.InterpolationSearch;
import main.java.sort.BubbleSort;
import main.java.sort.BucketSort;
import org.apache.commons.lang3.Range;
import org.apache.commons.math3.util.IntegerSequence;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;


public class Main {
  public static void main(String[] args) {
    //int[] list = {9, 10, 6, 21, 4, 1, 14};
    int[] list = IntStream.range(1, 1000).toArray();
    long inicio = System.currentTimeMillis();

    BubbleSort.bubbleSort(list);

    long fim = System.currentTimeMillis();
    long tempoExecucao = fim - inicio;

    System.out.println("Tempo de execução: " + tempoExecucao + " milissegundos");

    Range<Integer> listFloat = Range.between(1,1000);
    inicio = System.currentTimeMillis();

    BucketSort.bucketSort(list);

    fim = System.currentTimeMillis();
    tempoExecucao = fim - inicio;

    System.out.println("Tempo de execução: " + tempoExecucao + " milissegundos");

  }
}