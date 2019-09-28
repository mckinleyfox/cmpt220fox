import java.util.Scanner;

public class randomInt {

	public static void main(String[] args) {
		int[] num = new int[1000];
		int i = new int();
		for(int i= 0; i < 1000; i++) {
	        num[i] = 1+(int) (Math.random()*((1000-1)+1)); 
		}
		for(int i = 0; i < 1000; i ++) {
			int av = i/1000;
			System.out.println("The average is: " + average);
			if(num > avg) {
				System.out.println("The upper count is: " + num);
			}
			else
				System.out.println("The lower count is: " + num);
		}
			
	}

}
