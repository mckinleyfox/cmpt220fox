import java.util.Scanner;

public class outputs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		if(num1 < num2) {
			System.out.println(num1 + "is LESS THAN " + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is LESS THAN " + num2 + "? FALSE");
		if(num1 <= num2) {
			System.out.println(num1 + "is LESS THAN OR EQUAL TO" + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is LESS THAN OR EQUAL TO" + num2 + "? FALSE");
		if(num1 == num2) {
			System.out.println(num1 + "is EQUALS " + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is EQUALS " + num2 + "? FALSE");
		if(num1 != num2) {
			System.out.println(num1 + "is DOES NOT EQUAL " + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is DOES NOT EQUAL " + num2 + "? FALSE");
		if(num1 > num2) {
			System.out.println(num1 + "is GREATER THAN " + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is GREATER THAN " + num2 + "? FALSE");
		if(num1 >= num2) {
			System.out.println(num1 + "is GREATER THAN OR EQUAL TO " + num2 + "? TRUE");
		}
		else
			System.out.println(num1 + "is GREATER THAN OR EQUAL TO" + num2 + "? FALSE");
		
	}
}
