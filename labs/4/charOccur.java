import java.util.Scanner;

public class charOccur {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		int count[] = new int[character]; 
		String str = new String();  
		int count = 0;
        int len = str.length(); 
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++; 
        	char letter[] = new char[str.length()];
        	count[letter - a]++;

        }
        for (int i = 0; i < len; i++) { 
            letter[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
                if (str.charAt(i) == letter[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
	}
}
