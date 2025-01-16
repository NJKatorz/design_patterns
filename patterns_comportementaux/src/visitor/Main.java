package visitor;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(3.0);
    Shape square = new Square(4.0);

    CompoundShape group = new CompoundShape();
    group.addShape(circle);
    group.addShape(square);

    Shape circle2 = new Circle(4.0);
    CompoundShape group2 = new CompoundShape();
    group2.addShape(circle2);
    group2.addShape(group);

    XMLExportVisitor exportVisitor = new XMLExportVisitor();
    System.out.println(exportVisitor.export(group2));
  }
}

