import java.util.Scanner;

public class triMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the elements of the matrix : ");
		double matrix = new double[][];
		if (isUpperTriangular(matrix))
			System.out.println("It is an upper triangle matrix.");
		else
			System.out.println("It is not an upper triangle matrix.");

	}
	public static boolean isUpperTriangular(double[][] array) {
		for(i = 0; i < matrix.length; i++){
			for(j = 0; j < n; j++) {
				matrix[i][j] = .nextInt();
		}
		for (int i = 1; i < matrix.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (i>j && array[i][j] != 0) {
                    return false;
                }
            }
		}
        return true; 
	}
}
