package flyweight;

// ConcreteFlyweight
public class SharedChessPiece implements ChessPiece {
  private final String type;    // État intrinsèque
  private final String color;   // État intrinsèque

  public SharedChessPiece(String type, String color) {
    this.type = type;
    this.color = color;
  }

  @Override
  public void placePiece(int x, int y) {
    System.out.println(color + " " + type + " placed at position (" + x + ", " + y + ")");
  }
}

