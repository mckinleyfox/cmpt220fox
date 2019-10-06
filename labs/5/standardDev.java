import java.util.Scanner;

public class standardDev {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] array = new double[10];
		for (int i = 0; i < 10; i++ )
			array[i] = input.nextDouble();
//		array[1] = input.nextDouble();
//		array[2] = input.nextDouble();
//		array[3] = input.nextDouble();
//		array[4] = input.nextDouble();
//		array[5] = input.nextDouble();
//		array[6] = input.nextDouble();
//		array[7] = input.nextDouble();
//		array[8] = input.nextDouble();
//		array[9] = input.nextDouble();
		System.out.println("The mean is " + mean(array));
		System.out.println("The standard deviation is " + deviation(array));

	}
	
	public static double mean(double[] array) {
		double n = 10.0;
		double sum = 0;
		double mean = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
//			System.out.println("The mean is: " + mean);
		}
		mean = sum/n;
		return mean;
	}
	
	public static double deviation(double[] array) {
		double sd = 0;
		double mean = mean(array);
		for(int i = 0; i< array.length; i++) {
			sd += Math.pow(array[i] - mean, 2);
//			sd = (Math.sqrt(Math.pow(array[0] - mean, 2) + Math.pow(array[1] - mean, 2) + Math.pow(array[2] - mean, 2) + 
//					Math.pow(array[3] - mean, 2) + Math.pow(array[4] - mean, 2) + Math.pow(array[5] - mean, 2) + 
//					Math.pow(array[6] - mean, 2) + Math.pow(array[7] - mean, 2) + Math.pow(array[8] - mean, 2) + 
//					Math.pow(array[9] - mean, 2)))/(n);
//			System.out.println("The Standard Deviation is: " + sd);
		}
		return Math.sqrt(sd);
	}

}
