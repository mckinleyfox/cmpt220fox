import java.util.Scanner;

class lab1q4 { // JA: This name has to match the name of the file
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a mass: ");
		double mass = input.nextDouble(); // JA
		long energy = (long) (mass * Math.pow(299972458, 2));
		System.out.print("The Energy is: " + energy);
	}
}