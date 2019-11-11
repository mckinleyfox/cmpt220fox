
public class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
		System.out.println("This is an illegal triangle because the sum of "
				+ "two sides is greater than the other side.");
	}
}
