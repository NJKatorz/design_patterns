package visitor;

// ConcreteElement3
public class Circle implements Shape {
	private Point center;
	private double radius;

	public Circle(double radius) {
		this.center = new Point(0, 0); // Centre par défaut
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public void move(int x, int y) {
		center = new Point(center.getX() + x, center.getY() + y);
	}

	@Override
	public void draw() {
		System.out.println("Dessiner un cercle de rayon " + radius + " au point " + center.getX() + ", " + center.getY());
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCircle(this);
	}
}
