package iterator;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book("Design Patterns"));
    library.addBook(new Book("Clean Code"));
    library.addBook(new Book("Refactoring"));

    Iterator<Book> iterator = library.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next().getTitle());
    }
  }
}
