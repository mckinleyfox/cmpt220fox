public class Circle {
	private double x;
	private double y;
	private double radius;
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	// getArea() ?
	public double getRadius() {
		return radius;
	}
	public boolean contains(Circle circle) {
		double d = Math.pow(circle.x - getX(), 2) + Math.pow(circle.y - getY(), 2);
		if(d < Math.pow(radius, 2)- Math.pow(circle.radius, 2)){
			return true;
		}
		else
			return false;
	}
	public boolean overlaps(Circle circle) {
		double d = Math.pow(circle.x - getX(), 2) + Math.pow(circle.y - getY(), 2);
		if (d < Math.pow(radius, 2) - Math.pow(circle.radius, 2)){
			return true;
		}
		else
			return false;
	}
}
