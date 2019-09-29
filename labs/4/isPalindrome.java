import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] arg) {
		String str, reverse = "";
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter a string:");
	    str = sc.nextLine();
	 
	    //int length = str.length();
		if (isPalindrome(str))
			System.out.println("The word is palindrome.");
		else
			System.out.println("The word is not palindrome.");
	}
	
	public static String reverse(String str){ // JA
		String rev = "";
	    for ( int i = str.length() - 1; i >= 0; i-- )
			rev = rev + str.charAt(i);
		return rev;
	}
	
	public static boolean isPalindrome(String str) { // JA
	    if (str.equals(reverse(str))) {
	    	return true;
//	     	System.out.println(str+" is a palindrome");
	    } else {
	    	return false;
//	     	System.out.println(str+" is not a palindrome");
	    }
	}
	 
}
