package decorator;

// ConcreteDecoratorA
public class Lait extends Additif {
  public Lait(Boisson boisson) {
    super(boisson);
  }


  @Override
  public String getDescription() {
    return boisson.getDescription() + " avec lait";
  }

  @Override
  public double getPrix() {
    return boisson.getPrix() + 0.20;
  }
}
