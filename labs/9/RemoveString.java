import java.io.*;
import java.util.Scanner;

public class RemoveString {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("RemoveString <Stirng> <file>");
			System.exit(0);
		}
		
		// JA: You forgot to write it back to the file
		try {
			Scanner input = new Scanner(new File(args[1]));
			while(input.hasNextLine()) {
				String line = input.nextLine();
				line = line.replaceAll(args[0],  "");
			}
			input.close();
		} catch(FileNotFoundException ex) {
			System.out.println("Could not open file");
		}
	}	
}
