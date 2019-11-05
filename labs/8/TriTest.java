import java.util.Scanner;

public class TriTest {
	public static void main(String[] args) {
		double side1;
		double side2;
		double side3;
		String color;
		String fill;
		boolean triFilled;
		
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
	    	triFilled = true;
	    }
	    else
	    	triFilled = false;
	    
		// JA: Your class does not have this constructor. You need to add it.
	    Triangle tri = new Triangle(side1, side2, side3, color, triFilled);
		
		// JA: Print output?
	}
	
	
}
