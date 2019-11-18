//package lab10q4;

import java.util.Random;
import java.util.Scanner;

public class ApplianceApp extends Appliance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		int length = 40;
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = num.nextInt(40);
		}
		array.sort(appliance); // JA: Where is this array defined?
		for(Appliance a:appliance) {
			System.out.println(a);
		}
	}
}
