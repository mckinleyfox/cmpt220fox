import java.util.Scanner;

public class rowColumn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the square matrix: ");
		int row = nextInt();
		int column = nextInt();
		int matirx[][] = new int[row][column];
		System.out.println("Enter the values of the matrix: ");
//		int values = input.nextInt();
		for(int i = 0; i <row; i++) {
			for(int j = 0; j<column; j++) {
				matirx[i][j] = nextInt();
//				System.out.print(" ");
			}
		}
		for(int i = 0; i < column; i++){
      	    for(int j = 0; j < row; j++){
      	    	System.out.println("The transpose of the matrix is: " + matrix[j][i])
      	    }

	}

}
