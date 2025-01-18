package flyweight;

// ConcreteFlyweight
public class Zombie implements Ennemi {
  private final String type; // Ex : "Zombie classique", "Zombie rapide"
  private final String apparence; // Ex : Sprite ou modèle 3D
  private final int pointsDeVieDeBase;

  public Zombie(String type, String apparence, int pointsDeVieDeBase) {
    this.type = type;
    this.apparence = apparence;
    this.pointsDeVieDeBase = pointsDeVieDeBase;
  }

  @Override
  public void afficher(Position position) {
    System.out.println(type + " avec apparence " + apparence +
        " affiché à la position " + position.getX() + ", " + position.getY());
  }
}
