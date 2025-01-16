package flyweight;
import java.util.List;

// UnsharedConcreteFlyweight
public class ChessRow implements ChessPiece {
  private List<ChessPiece> pieces; // Liste de Flyweights partagés
  private final int row;           // État spécifique à la ligne

  public ChessRow(List<ChessPiece> pieces, int row) {
    this.pieces = pieces;
    this.row = row;
  }

  @Override
  public void placePiece(int x, int y) {
    System.out.println("Placing row " + row + ":");
    for (int col = 0; col < pieces.size(); col++) {
      pieces.get(col).placePiece(row, col); // Place chaque pièce
    }
  }
}

