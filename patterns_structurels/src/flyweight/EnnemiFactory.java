package flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
public class EnnemiFactory {
  private final Map<String, Ennemi> ennemis = new HashMap<>();

  public Ennemi getEnnemi(String type, String apparence, int pointsDeVieDeBase) {
    String key = type + "-" + apparence;
    if (!ennemis.containsKey(key)) {
      ennemis.put(key, new Zombie(type, apparence, pointsDeVieDeBase));
      System.out.println("Création d'un nouvel ennemi : " + type);
    }
    return ennemis.get(key);
  }
}
