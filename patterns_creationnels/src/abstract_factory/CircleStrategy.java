package abstract_factory;

// ConcreteFactory2
public class CircleStrategy implements Strategy{
  // CreateProductA()
  @Override
  public Shape createShape(double size, Point point) {
    return new Circle(size, point);
  }
}
