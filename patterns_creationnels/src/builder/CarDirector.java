package builder;

public class CarDirector {
  // Director

  private final CarImpl.Builder builder;

  public CarDirector(CarImpl.Builder builder) {
    this.builder = builder;
  }

  public Car constructSportsCar() {
    return builder
        .setEngine("V8")
        .setColor("Red")
        .setSunroof(true)
        .setLitre(5)
        .build();
  }

  public Car constructFamilyCar() {
    return builder
        .setEngine("V6")
        .setColor("Blue")
        .setSunroof(false)
        .setLitre(3)
        .build();
  }

  public Car constructEcoCar() {
    return builder
        .setEngine("Electric")
        .setColor("Green")
        .setSunroof(false)
        .setLitre(0)
        .build();
  }
}
