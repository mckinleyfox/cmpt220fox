import java.util.Scanner;
import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		int length = 100;
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = num.nextInt(100);
		}
		System.out.println("Enter a value for the index(0 - " + (length-1) + ") :");
		int index = input.nextInt();
		if( index < 0 || index < length - 1) {
			System.out.println("This index is out of bounds.");
		}
		else {
			System.out.println("The element value in the index is: " + array[index]);
		}
	}
}
