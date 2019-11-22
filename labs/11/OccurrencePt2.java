import java.util.Scanner;

public class OccurrencePt2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.next();
		char [] temp = str.toCharArray();
		System.out.println("Type a letter to check for: ");
		str = input.next();
		char character = str.charAt(0);
		System.out.println("There are " + count(temp, character) + str + " in this string.");
	}
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}
	public static int count(char[] chars, char ch, int high) {
		if(high >= 0) {
			return count(chars, ch, high -1) + (Character.toString((chars[high])).
					equals(Character.toString(ch)) ? 1 : 0);
		}else
			return 0;
	}
}
