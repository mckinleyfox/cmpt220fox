import java.util.Scanner;

public class rowAvg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		double rows = input.nextDouble();
		System.out.println("Enter the number of columns: ");
		double col = input.nextDouble();
		double [][] array = new double[rows][col];
		System.out.println("Enter the numbers in the array: ");
	}
	
	// JA: The average is for a specific row
	public static double averageRow(double[][] row, int index) {
//		double avg [] = new double[row.length];
		double avg = 0;
		double sum = 0;
//		for(int i = 0; i<row.length; i++) {
			for(int j = 0; j< row.length; j++) {
				sum += row[index][j];
			}
//		}
		avg = sum/row.length;			
		return avg;
	}

}
