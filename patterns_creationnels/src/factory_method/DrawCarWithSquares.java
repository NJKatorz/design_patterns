package factory_method;

// ConcreteCreator
public class DrawCarWithSquares extends DrawCar {

  // FactoryMethod()
  @Override
  public Shape createShape(double size, Point point) {
    return new Square(size, point);
  }
}
