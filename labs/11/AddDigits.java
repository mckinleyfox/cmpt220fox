import java.util.Scanner;

public class AddDigits {
	static int sum;
	public static void main(String[] args) {
		try {
			System.out.println("Enter the number : ");
			Scanner input = new Scanner(System.in);
			String s = input.next();
			int num = Integer.parseInt(s);
			System.out.println("The sum of the digits is: " +sumDigits(num));
		}catch(Exception e) {
			System.out.println("Oops, there is an exception.");
			System.exit(0);
		}
	}
	public static int sumDigits(long n) {
		if(n==0)
			return sum;
		else {
			sum = sum + (int)n % 10;
			n = n/10;
			return sum;
		}
	}
}
