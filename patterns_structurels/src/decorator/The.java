package decorator;

// ConcreteComponentB
public class The implements Boisson{
  @Override
  public String getDescription() {
    return "Thé";
  }

  @Override
  public double getPrix() {
    return 0.90;
  }
}
