import java.util.Scanner;

public class identicalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first array of numbers(first number is size of array): ");
		double[] arr1 = new double[];
		System.out.println("Enter the second array of numbers(first number is size of array): ");
		double[] arr2 = new double[];

	}
	public static boolean equal(int[] x, int[] y) {
		int[] x = new int[arr1.length];
		int[] y = new int[arr2.length];
		if(x != y) {
			return false;
			System.out.println("They are not identical.");
		}
		for(int i = 0; i < x; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
				System.out.println("They are not identical.");
			}
		}
		return true;
		System.out.println("They are identical.");
	}

}
