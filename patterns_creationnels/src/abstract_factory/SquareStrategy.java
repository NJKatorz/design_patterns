package abstract_factory;

// ConcreteFactory1
public class SquareStrategy implements Strategy {
  // CreateProductA()
  @Override
  public Shape createShape(double size, Point point) {
    return new Square(size, point);
  }
}
