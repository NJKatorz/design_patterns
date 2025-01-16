package abstract_factory;// Strategy -> Abstract Factory

public class Main {
  public static void main(String[] args) {
    DrawCar d = new DrawCar();
    d.draw(5, new CircleStrategy());
  }
}
