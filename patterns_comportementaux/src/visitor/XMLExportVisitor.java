package visitor;

// ConcreteVisitor
public class XMLExportVisitor implements Visitor {

  public String export(Shape shape) {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
    sb.append(shape.accept(this));
    return sb.toString();
  }

  @Override
  public String visitCircle(Circle circle) {
    return "<circle>" + "\n" +
        "\t<radius>" + circle.getRadius() + "</radius>" + "\n" +
        "\t<diameter>" + circle.getDiameter() + "</diameter>" + "\n" +
        "</circle>";
  }

  @Override
  public String visitSquare(Square square) {
    return "<square>" + "\n" +
        "\t<size>" + square.getSize() + "</size>" + "\n" +
        "</square>";
  }

  @Override
  public String visitCompoundShape(CompoundShape compoundShape) {
    StringBuilder sb = new StringBuilder();
    for (Shape shape : compoundShape.getShapes()) {
      String obj = shape.accept(this);
      obj = "\t" + obj.replace("\n", "\n\t") + "\n";
      sb.append(obj);
    }
    return "<compound_shape>" + "\n" + sb.toString() + "</compound_shape>";
  }
}
