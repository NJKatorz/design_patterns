package builder;

// Product
public class CarImpl implements Car {
  private final String engine;
  private final String color;
  private final boolean sunroof;
  // Peut etre modifiable
  private int litre;

  private CarImpl(Builder builder) {
    this.engine = builder.engine;
    this.color = builder.color;
    this.sunroof = builder.sunroof;
    this.litre = builder.litre;
  }

  @Override
  public String getEngine() {
    return this.engine;
  }

  @Override
  public String getColor() {
    return this.color;
  }

  @Override
  public boolean isSunroof() {
    return this.sunroof;
  }

  public int getLitre() {
    return litre;
  }

  // ConcretBuilder
  public static class Builder {

    // private final String name
    // parametres par défaut, peut etre modifiable seul avant la construction de l'object
    private String engine = "";
    private String color = "";
    private boolean sunroof = false;
    private int litre;

    public Builder() {

    }

    /**
     * Pour les parametres obligatoire à mettre mais non modifiable après la construction de l'objet
     * public Builder (String name) { this.name = name }
     */

    public Builder setEngine(String engine) {
      this.engine = engine;
      return this;
    }

    public Builder setColor(String color) {
      this.color = color;
      return this;
    }

    public Builder setSunroof(boolean sunroof) {
      this.sunroof = sunroof;
      return this;
    }

    public Builder setLitre(int litre) {
      this.litre = litre;
      return this;
    }

    // buildPart()
    public CarImpl build() {
      return new CarImpl(this);
    }


  }
}
