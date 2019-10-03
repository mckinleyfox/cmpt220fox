import java.util.Scanner;

public class intValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first letter:");
		char letterOne = input.next().charAt(0); 
		
		System.out.print("Enter the second letter:"); 
		char letterTwo = input.next().charAt(0); 
		
		System.out.println(letterOne + letterTwo);

	}

}
