package flyweight;

import java.util.ArrayList;
import java.util.List;

// Client
public class Main {
  public static void main(String[] args) {
    ChessPieceFlyweightFactory factory = new ChessPieceFlyweightFactory();

    // Flyweights partagés
    ChessPiece whitePawn = factory.getChessPiece("Pawn", "White");
    ChessPiece blackPawn = factory.getChessPiece("Pawn", "Black");
    ChessPiece whiteKing = factory.getChessPiece("King", "White");

    // Ligne de pions blancs (Unshared Flyweight)
    List<ChessPiece> rowPieces = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      rowPieces.add(whitePawn); // Partage du même Flyweight
    }
    ChessRow whitePawnRow = new ChessRow(rowPieces, 2);

    // Placement des pièces
    whitePawn.placePiece(2, 1);  // Flyweight partagé
    blackPawn.placePiece(7, 1);  // Flyweight partagé
    whiteKing.placePiece(1, 5);  // Flyweight partagé
    whitePawnRow.placePiece(2, 0); // Unshared Flyweight
  }
}
