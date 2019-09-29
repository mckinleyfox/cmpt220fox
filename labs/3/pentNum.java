import java.util.Scanner;

public class pentNum {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i <= 50; i++) {
			int n = new int[];
			System.out.print(pent(i) + " ");
			if(count % 10 == 0) {
				System.out.println();
			}
			count++;
		}
	}
	public static int pent(int[] n) {
		return(((Math.pow(3 * n, 2))-n)/2);
	}
}
