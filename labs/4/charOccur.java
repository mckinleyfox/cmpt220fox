import java.util.Scanner;

public class charOccur {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // JA: You need this to get the input
		System.out.println("Enter a string: ");
		int count[] = new int[26]; // JA: You need space for all the letters
		String str = input.nextLine();  // JA: Read the string
		//int count = 0;
		// JA: Initialize the array to zero
		for (int i=0;i<26;i++)
			count[i] = 0;
        int len = str.length(); 
        for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') continue;
            count[str.toLowerCase().charAt(i) - 'a']++; 
        	//char letter[] = new char[str.length()];
        	//count[letter - a]++; 

        }
        for (int i = 0; i < 26; i++) { 
         //   letter[i] = str.charAt(i); // 
         //   int find = 0; 
         //   for (int j = 0; j <= i; j++) { 
         //       if (str.charAt(i) == letter[j])  
         //           find++;                 
         //   } 
  
         //   if (find == 1) 
			  if (count[i] > 0)
                System.out.println("Number of Occurrence of " + 
              //   str.charAt(i) + " is:" + count[str.charAt(i)]);             
                 (char)(i + 'a') + " is:" + count[i]);             
       } 
	}
}
