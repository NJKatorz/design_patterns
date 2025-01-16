package composite;

// Leaf1
public class FileTxt implements File {
  private String name;

  public FileTxt(String name) {
    this.name = name;
  }

  // + operation()
  @Override
  public void showDetails() {
    System.out.println("File: " + name);
  }
}
