package decorator;

public class Main {

  public static void main(String[] args) {
    // Café simple
    Boisson cafe = new Cafe();
    System.out.println(cafe.getDescription() + " coûte " + cafe.getPrix() + " euros.");

    // Café avec sucre
    cafe = new Sucre(cafe);
    System.out.println(cafe.getDescription() + " coûte " + cafe.getPrix() + " euros.");

    // Café avec sucre et lait
    cafe = new Lait(cafe);
    System.out.println(cafe.getDescription() + " coûte " + cafe.getPrix() + " euros.");

    System.out.println("----------------------------------------------------------------------");

    // Thé simple
    Boisson the = new The();
    System.out.println(the.getDescription() + " coûte " + the.getPrix() + " euros.");

    // Thé avec sucre
    the = new Sucre(the);
    System.out.println(the.getDescription() + " coûte " + the.getPrix() + " euros.");

    // Thé avec sucre et lait
    the = new Lait(the);
    System.out.println(the.getDescription() + " coûte " + the.getPrix() + " euros.");
  }
}
