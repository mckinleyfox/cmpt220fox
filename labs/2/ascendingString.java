import java.util.Scanner;

public class ascendingString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number:");
		String num1 = input.next();
		System.out.print("Enter second number:"); 
		String num2 = input.next(); 
		System.out.println(num1.compareTo(num2));
		
		if(num1.compareTo(num2)<=0){  
			System.out.println(num1);
			System.out.println(num2);
		} else {							
			System.out.println(num2);
			System.out.println(num1);

	}

}
