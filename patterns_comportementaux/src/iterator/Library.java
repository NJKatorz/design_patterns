package iterator;

import java.util.ArrayList;
import java.util.List;

// Concrete Aggregate
public class Library implements BookCollection {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public Iterator<Book> iterator() {
    return new BookIterator(books);
  }
}
