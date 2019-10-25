import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle c1 = new Circle(2, 2, 5.5);
		System.out.println("The area of the circle is: " + c1.getArea());
		System.out.println("The perimeter of the circle is: " + c1.getPerimeter());
		System.out.println("The point (3,3) lies in the circle: " + c1.contains(3,3));
		Circle c2 = new Circle(4, 5, 10.5);
		System.out.println("c1 contains c2: " + c1.contains(c2));
		Circle c3 = new Circle(3, 5, 2.3);
		System.out.println("c3 overlaps c1: " + c1.overlaps(c3));
	}

}
