package composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory implements File {
  private String name;
  private List<File> files = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public void addComponent(File component) {
    files.add(component);
  }

  public void removeComponent(File component) {
    files.remove(component);
  }

  // + operation()
  @Override
  public void showDetails() {
    System.out.println("Directory: " + name);
    for (File component : files) {
      component.showDetails();
    }
  }
}
