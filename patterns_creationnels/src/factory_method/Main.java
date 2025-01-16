package factory_method;

// Template Method -> Factory Method
public class Main {
  public static void main(String[] args) {
    DrawCar d = new DrawCarWithCircles();
    d.draw(5);
  }
}
