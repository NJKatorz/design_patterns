package decorator;

// ConcreteComponentA
public class Cafe implements Boisson {
  @Override
  public String getDescription() {
    return "Café";
  }

  @Override
  public double getPrix() {
    return 1.00;
  }
}
