import java.util.Scanner;
import java.io.*;

public class Occurence {
	static int a = 0;
	public static void main(String[] args) {
		try {
			System.out.println("Enter a string: ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			System.out.println("Type a letter to check for: ");
			String temp = input.nextLine();
			char c = temp.charAt(0);
			int num = num(str, c);
			System.out.println("There are " + num + c + "in this string.");
		}catch(Exception e) {
			System.out.println("Oops, there was an exception. The program cannot run.");
			System.exit(0);
		}
	}
	public static int num( String str, char ch) {
		return num(str, ch, 0);
	}
	public static int num(String str, char ch, int high) {
		if(str.contentEquals("")) {
			return 0;
		}
		if(high + 1 <= str.length()) {
			if(str.substring(high,  high +1).equals(Character.toString(ch))) {
				a++;
			}
		}
		num(str.substring(high + 1, str.length(), ch, high));
			return a;
	}
}
