
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	public Triangle() {
		super("", false);
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public void setside1(double side1) {
		this.side1 = side1;
	}
	public void setside2(double side2) {
		this.side2 = side2;
	}
	public void setside3(double side3) {
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		return (side1 + side2 + side3)/2;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "Side 1 is: " + side1 + "\n Side 2 is: " + side2 + "\n Side 3 is: " + side3 +
			"\n The color is: " + getColor() + "\n The triangle is filled?" + isFilled();	
				
	}
}
