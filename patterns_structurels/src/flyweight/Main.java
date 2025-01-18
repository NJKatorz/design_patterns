package flyweight;

public class Main {
  public static void main(String[] args) {
    EnnemiFactory factory = new EnnemiFactory();

    // Création ou récupération des Flyweights
    Ennemi zombieClassique = factory.getEnnemi("Zombie classique", "Sprite1", 100);
    Ennemi zombieRapide = factory.getEnnemi("Zombie rapide", "Sprite2", 150);

    // Position extrinsèque (non partagée)
    Position position1 = new Position(10, 20);
    Position position2 = new Position(30, 40);
    Position position3 = new Position(50, 60);

    // Affichage des ennemis avec des états extrinsèques différents
    zombieClassique.afficher(position1);
    zombieRapide.afficher(position2);
    zombieClassique.afficher(position3);
  }
}
