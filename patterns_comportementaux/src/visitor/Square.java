package visitor;

// ProductA1
public class Square implements Shape {
  private final double size;
  private final Point center;

  public Square(double size) {
    this.size = size;
    this.center = new Point(0, 0); // Centre par défaut
  }

  public double getSize() {
    return size;
  }

  public Point getCenter() {
    return center;
  }

  @Override
  public void move(int x, int y) {
    // move a Square
  }

  @Override
  public void draw() {
    // draw a Square
  }

  @Override
  public String accept(Visitor v) {
    return v.visitSquare(this);
  }


}
