import java.util.Scanner;

public class randomInt {

	public static void main(String[] args) {
		int[] num = new int[1000];
		//int i = new int();
		int sum = 0;
		for(int i= 0; i < 1000; i++) {
	        num[i] = 1+(int) (Math.random()*((1000-1)+1)); 
			sum += num[i]; // JA: Keep track of the sum
		}
		double average = sum / 1000.; // JA: Calculate the average
		int upper = 0; // JA: To keep track of the higher numbers
		int lower = 0; // JA: To keep track of the lower numbers
		for(int i = 0; i < 1000; i ++) {
//			int av = i/1000;
			if(num[i] > average) {
				upper++;
			}
			else
				lower++;
		}
		System.out.println("The average is: " + average);
		System.out.println("The upper count is: " + upper);
		System.out.println("The lower count is: " + lower);

			
	}

}
