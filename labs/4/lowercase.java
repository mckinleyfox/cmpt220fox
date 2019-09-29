import java.util.Scanner;

public class lowercase { // JA: Always use upper case for the class names
	public static void main(String[] args) {
		char[][] alph =  new char [5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				int matrix = (int)(Math.random()*('z'-'a') + 'a');
				alph[i][j] = (char)(matrix);
				System.out.print(alph[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
}
