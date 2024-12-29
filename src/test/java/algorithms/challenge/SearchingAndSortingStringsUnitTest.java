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
          "Oceano",
          "Pintura",
          "Relógio",
          "Sorriso",
          "Viagem");

  @Test
  public void searchAndSortingStrings() {
    List<String> actual = mergeSortStrings(listToSort);
    assertEquals(listOrder, actual);
  }

  @Test
  public void orderListQuickSort() {
    List<String> actual = quickSortStrings(listToSort);
    assertEquals(listOrder, actual);
  }

  @Test
  public void searchWordBinarySearch() {
    String target = "Café";
    int result = binarySearchStrings(listOrder, target);
    Assertions.assertEquals(target, listOrder.get(result));
  }
}
