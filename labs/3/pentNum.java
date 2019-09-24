import java.util.Scanner;

public class pentNum {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i <= 50; i++) {
			System.out.println("Enter an integer value: ");
			int n = new int[];
			if(count % 10 == 0) {
				System.out.print();
				count++;
			}
		}
	}
	public static int pent(int[] n) {
		return(((Math.pow(3 * n, 2))-n)/2);
	}
}
