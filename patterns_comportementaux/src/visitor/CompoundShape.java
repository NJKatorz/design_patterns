package visitor;

import java.util.ArrayList;
import java.util.List;

// ConcreteElement2
public class CompoundShape implements Shape {
  private List<Shape> shapes = new ArrayList<>();

  public void addShape(Shape shape) {
    shapes.add(shape);
  }

  @Override
  public void move(int x, int y) {
    for (Shape shape : shapes) {
      shape.move(x, y);
    }
  }

  @Override
  public void draw() {
    System.out.println("Dessiner une forme composée :");
    for (Shape shape : shapes) {
      shape.draw();
    }
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitCompoundShape(this);
  }

  public List<Shape> getShapes() {
    return shapes;
  }
}
