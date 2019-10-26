import java.util.Scanner;

public class almostPerfect {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 500; i++) {
				System.out.println("Enter a number: ");
				int num = input.nextInt();
				for(int j = 1; j<num; j++) {
					if(num%j==0) {
						sum = sum + j;
					}
				}
				if(sum == num) {
					System.out.println(num + "Perfect");
				}
				if (sum == num + 2 || sum == num - 2) {
					System.out.println(num + "Almost Perfect");
				}
				else
					System.out.println(num + "Not perfect");

		}

}
		
	}

