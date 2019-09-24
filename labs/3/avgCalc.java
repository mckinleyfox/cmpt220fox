import java.util.Scanner;

public class avgCalc {
	public static void main(String[] args) {
		Scanner in = new Scanner(system.in);
		System.out.print("Enter the first number: ");
		double a = in.nextDouble();
		System.out.print("Enter the second number: ");
		double b = in.nextDouble();
		System.out.print("Enter the third number: ");
		double c = in.nextDouble();
		System.out.print("The average is: " + average(a, b, c));
	}
	public static double average(double a, double b, double c) {
		return (a, b, c) / 3;
	}
}
