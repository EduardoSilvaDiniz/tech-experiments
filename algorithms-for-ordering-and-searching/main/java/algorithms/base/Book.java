package main.java.algorithms.base;

public class Book {
  private final String ISBN;
  private final String title;
  private final String author;
  private final int year;

  public Book(String ISBN, String title, String author, int year) {
    this.ISBN = ISBN;
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String getISBN() {
    return ISBN;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "Título: " + title + " (ISBN: " + ISBN + ")";
  }
}
