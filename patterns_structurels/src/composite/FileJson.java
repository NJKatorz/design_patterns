package composite;

// Leaf2
public class FileJson implements File {
  private String name;

  public FileJson(String name) {
    this.name = name;
  }

  // + operation()
  @Override
  public void showDetails() {
    System.out.println("File: " + name);
  }
}

