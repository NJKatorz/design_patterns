package factory_method;

// ConcreteCreator
public class DrawCarWithCircles extends DrawCar {
  // FactoryMethod()
  @Override
  public Shape createShape(double size, Point point) {
    return new Circle(size, point);
  }
}
