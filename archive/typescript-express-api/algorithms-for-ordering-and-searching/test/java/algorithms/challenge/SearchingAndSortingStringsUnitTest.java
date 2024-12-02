package test.java.algorithms.challenge;

import static main.java.algorithms.challenge.SearchingAndSortingStrings.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchingAndSortingStringsUnitTest {
  private final List<String> listToSort =
      Arrays.asList(
          "Abacaxi",
          "Relógio",
          "Montanha",
          "Estrela",
          "Computador",
          "Girassol",
          "Chocolate",
          "Oceano",
          "Elefante",
          "Pintura",
          "Caramelo",
          "Viagem",
          "Música",
          "Arco-íris",
          "Livro",
          "Sorriso",
          "Desenho",
          "Café",
          "Borboleta",
          "Aventuras");
  private final List<String> listOrder =
      Arrays.asList(
          "Abacaxi",
          "Arco-íris",
          "Aventuras",
          "Borboleta",
          "Café",
          "Caramelo",
          "Chocolate",
          "Computador",
          "Desenho",
          "Elefante",
          "Estrela",
          "Girassol",
          "Livro",
          "Montanha",
          "Música",
          "Pintura",
          "Relógio",
          "Sorriso",
          "Viagem",
          "Oceano");

  @Test
  public void searchAndSortingStrings() {
    //TODO está com problemas com tamanho da lista
    mergeSortStrings(listToSort);
    assertEquals(listOrder, listToSort);
  }

  @Test
  public void orderListQuickSort() {
    //TODO está com problemas com tamanho da lista
    quickSortStrings(listToSort);
    assertEquals(listOrder, listToSort);
  }

  @Test
  public void searchWordBinarySearch() {
    String target = "Mango";
    int result = binarySearchStrings(listOrder, target);
    Assertions.assertEquals(3, result);
  }
}
