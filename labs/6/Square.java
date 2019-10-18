public class SquareTest {
	public static void main(String[] args) {
		Square square1 = new Square(40);
		Square square2 = new Square(35.9);
		System.out.println("The width of the first square is: " + square1.width);
		System.out.println("The area of the first square is: " + square1.getArea());
		System.out.println("The perimeter of the first square is: " + square1.getPerimeter());
		System.out.println("The width of the second square is: " + square2.width);
		System.out.println("The area of the first square is: " + square1.getArea());
		System.out.println("The perimeter of the first square is: " + square1.getPerimeter());
	}	
}

public class Square {
	double width = 1.0;
	Square(){
	}
	Square(double newWidth){
		width = newWidth;
	}
	double getArea() {
		return Math.pow(width, 2);
	}
	double getPerimeter() {
		return 4 * width;
	}
}
