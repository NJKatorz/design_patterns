package flyweight;
import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
public class ChessPieceFlyweightFactory {
  private Map<String, ChessPiece> flyweights = new HashMap<>();

  public ChessPiece getChessPiece(String type, String color) {
    String key = type + "-" + color;
    if (!flyweights.containsKey(key)) {
      flyweights.put(key, new SharedChessPiece(type, color));
    }
    return flyweights.get(key);
  }
}
