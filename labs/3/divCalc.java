import java.until.Scanner;

public class divCalc {
	public static void main(String[] args);
		int count = 0;
		int line = 10;
		for(int i = 100; i <= 500; i++) {
			if(i % 5 == 0 || i % 7 == 0 ) {
				count ++;
				if( count % line == 0) {
					System.out.println(i);
					else
						System.out.print(i + "");
				}
			}
		}
		}
}
