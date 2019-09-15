import java.util.Scanner;

class lab1q3 { // JA: This name has to match the name of the file
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for ounces: ");
		double ounces = input.nextDouble(); // JA: nextDouble() is a method of the Scanner
		double grams = ounces * 28.3495;
		System.out.print(ounces + " ounces is " + grams + " grams"); // JA: Single aregument in Java
	}
}

