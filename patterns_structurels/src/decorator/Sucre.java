package decorator;

// ConcreteDecoratorB
public class Sucre extends Additif {
  public Sucre(Boisson boisson) {
    super(boisson);
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " avec sucre";
  }

  @Override
  public double getPrix() {
    return boisson.getPrix() + 0.10;
  }
}

