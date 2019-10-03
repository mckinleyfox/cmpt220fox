import java.util.Scanner;

public class randomInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a lower limit: ");
		int lower = input.nextInt();
		
		System.out.print("Enter an upper limit: ");
		int upper = input.nextInt();
		
		System.out.println("Random number one is: " + (int) Math.random()*(upper-lower));
		System.out.println("Random number two is: " + (int)Math.random()*(upper-lower));
		System.out.println("Random number three is: " + (int) Math.random()*(upper-lower));

	}

}
