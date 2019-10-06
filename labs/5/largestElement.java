import java.util.Scanner;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] a = new double[10];
		a[0] = input.nextDouble();
		a[1] = input.nextDouble();
		a[2] = input.nextDouble();
		a[3] = input.nextDouble();
		a[4] = input.nextDouble();
		a[5] = input.nextDouble();
		a[6] = input.nextDouble();
		a[7] = input.nextDouble();
		a[8] = input.nextDouble();
		a[9] = input.nextDouble();
		System.out.println("The maximum value is: " + max(a));
	}
	
	public static double max(double[] a) {
		double max = a[0];
		for(int i = 0; i< a.length; i++) {
			if(a[i]> max) {
				max = a[i];
			}	
		}
		return max;
		
	}

}
