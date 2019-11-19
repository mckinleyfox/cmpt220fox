import java.util.Scanner;

public class LargestInt {
	public static void main(String[] args) {
		int val;
		int large;
		int[] a = new int[8];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 8 numbers: ");
		for(int i = 0; i < a.length; i++ ) {
			val = s.nextInt();
			a[i] = val;
		}
		large = a[0];
		large = largest(a, a.length -1, large);
		System.out.println("The largest number in the array is: " + large);
	}
	public static int largest(int[] array, int size, int large) {
		if(size > -1) {
			if(array[size] > large) {
				large = array[size];
			}
			return (large = largest(a, a.length -1, large));
		}else
			return large;
	}
}
