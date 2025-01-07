package main.java.algorithms.challenge;

import main.java.algorithms.base.Book;

import java.util.List;

public class BinarySearchBooks {

  public static Book binarySearchBooks(List<Book> books, String targetISBN) {
    int low = 0;
    int high = books.size() - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      String midISBN = books.get(mid).getISBN();

      if (midISBN.equals(targetISBN)) return books.get(mid);
      else if (midISBN.compareTo(targetISBN) < 0) low = mid + 1;
      else high = mid - 1;
    }
    return null;
  }
}