import java.util.Scanner;

public class TriTest {
	public static void main(String[] args) {
		double side1;
		double side2;
		double side3;
		String color;
		String fill;
		boolean TriFilled;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for side 1");
	    	side1 = input.nextDouble();
	    System.out.println("Enter a number for side 2");
	       side2 = input.nextDouble();
	    System.out.println("Enter a number for side 3");
	       side3 = input.nextDouble();
	    System.out.println("Enter a color ");
	       color = input.next();
	    System.out.println("Is the triangle filled?(Y or N)");
	    	fill = input.next();
	    if(fill.charAt(0)== 'Y') {
	    	TriFilled = true;
	    }
	    else
	    	TriFilled = false;
	    
	    Triangle tri = new Triangle(side1, side2, side3, color, fill);
	}
	
	
}
