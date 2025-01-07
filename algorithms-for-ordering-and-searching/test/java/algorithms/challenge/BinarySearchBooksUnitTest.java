package test.java.algorithms.challenge;

import main.java.algorithms.base.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static main.java.algorithms.challenge.BinarySearchBooks.binarySearchBooks;

public class BinarySearchBooksUnitTest {
  @Test
  public void binarySearchBooksTest() {
    List<Book> library = new ArrayList<>();
    library.add(new Book("978-0-123456-47-2", "Livro A", "Autor A", 2020));
    library.add(new Book("978-0-223456-47-5", "Livro B", "Autor B", 2021));
    library.add(new Book("978-0-323456-47-8", "Livro C", "Autor C", 2022));
    library.add(new Book("978-0-423456-47-1", "Livro D", "Autor D", 2023));
    library.add(new Book("978-0-523456-47-9", "Livro E", "Autor E", 2019));

    library.sort(Comparator.comparing(Book::getISBN));
    String isbnToFind = "978-0-323456-47-8";
    Book book = binarySearchBooks(library, isbnToFind);
    Assertions.assertEquals(isbnToFind, book.getISBN());
  }
}
