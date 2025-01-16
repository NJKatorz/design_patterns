package decorator;

// Decorator
public abstract class Additif implements Boisson {
  protected Boisson boisson;

  public Additif(Boisson boisson) {
    this.boisson = boisson;
  }

  @Override
  public String getDescription() {
    return boisson.getDescription();
  }

  @Override
  public double getPrix() {
    return boisson.getPrix();
  }
}
