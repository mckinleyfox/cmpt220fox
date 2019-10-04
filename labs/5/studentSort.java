import java.util.Scanner;

public class studentSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		String[] num = new String[input.nextInt()];
		System.out.println("Enter the name of each student: ");
		System.out.println("Enter the corresponding scores for each student");
		int[] score = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			num[i] = input.next();
			score[i] = input.nextInt();
		}
		double min = 0;
		for(int i = 0; i < num.length; i++){
			min = num[i];
			minIndex = i;
			for(j = i + 1; j< num.length; j ++){
				if(num[j] < min);{
					min= num[j];
					minIndex = num[j];
			}	
			tmp= num[i];
			num[i]= num[j];
			num[i]= tmp;						
			}
		System.out.println(" " + num + score);
		}
	}

}
