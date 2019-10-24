import java.util.Scanner;

public class almostPerfect {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = num.nextInt;
		for(int i = 1; i<num; i++) {
			if(num%i==0) {
				sum = sum +1;
			}
		}
		if(sum == num) {
			System.out.println(num + "Perfect");
		}
		if (sum == num + 1) {
			System.out.println(num + "Almost Perfect");
		}
		else
			System.out.println(num + "Not perfect");

	}

}
