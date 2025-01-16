package builder;

public class Main {

  public static void main(String[] args) {

    Car car = new CarImpl.Builder()
        .setEngine("V8")
        .setColor("Blue")
        .setSunroof(true)
        .build();

    System.out.println("Car { \n" +
        "  Engine : " + car.getEngine() + ",\n" +
        "  Color : " + car.getColor() + ",\n" +
        "  Sunroof : " + car.isSunroof() + "\n" +
        "}");

    System.out.println("*************************************************************************");

    CarImpl.Builder builder = new CarImpl.Builder();
    CarDirector director = new CarDirector(builder);

    Car sportsCar = director.constructSportsCar();
    Car familyCar = director.constructFamilyCar();
    Car ecoCar = director.constructEcoCar();

    System.out.println("Sports Car: \n" +
        "  Engine: " + sportsCar.getEngine() + "\n" +
        "  Color: " + sportsCar.getColor() + "\n" +
        "  Sunroof: " + sportsCar.isSunroof());

    System.out.println("Family Car: \n" +
        "  Engine: " + familyCar.getEngine() + "\n" +
        "  Color: " + familyCar.getColor() + "\n" +
        "  Sunroof: " + familyCar.isSunroof());

    System.out.println("Eco Car: \n" +
        "  Engine: " + ecoCar.getEngine() + "\n" +
        "  Color: " + ecoCar.getColor() + "\n" +
        "  Sunroof: " + ecoCar.isSunroof());

  }
}