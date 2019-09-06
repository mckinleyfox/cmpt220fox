import java.util.Scanner;
	class Conversion{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a value for ounces: ");
			double ounces = input.ounces();
			double grams = ounces * 28.3495;
			System.out.print(ounces, "ounces is ", grams, "grams");
		}
	}

