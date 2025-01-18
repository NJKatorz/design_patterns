package visitor;

// Visitor
public interface Visitor {
  String visitCircle(Circle circle);
  String visitSquare(Square s);
  String visitCompoundShape(CompoundShape cs);
}

