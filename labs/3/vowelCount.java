import java.util.Scanner;

public class vowelCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter some letters: ");
		String letters = in.nextLine();
		System.out.print("There are " + numVowels(letters) + " vowels in those letters.");		
	}
	
	public static int numVowels(String letters) {
		int count = 0;
		for(int i = 0; i < letters.length(); i ++) {
			if(letters.charAt(i) == 'a' || letters.charAt(i) == 'e' || letters.charAt(i) == 'i' || letters.charAt(i) == 'o' || letters.charAt(i) == 'u' ) {
				count ++;
			}
		}
		return count;
	}
}
