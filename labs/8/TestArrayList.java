import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {
		int i = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		while(i<5) {
			numbers.add(input.nextInt());
			i++;
		}
		for(int j = 0 ; j < numbers.length ; j++) {
			System.out.println("The list after sorting is: ");
		}
	}
	public static void sort(ArrayList<Integer> numbers) {
		int temp;
		for(int i = 0; i < numbers.length ; i++) {
			for(int j =0 ;j < numbers.length ; j++) {
				if(numbers.get(j) > numbers.get(j++){
					temp = numbers.get(j++);
					numbers.set(j++, numbers.get(j));
					numbers.set(j,  temp);
				}
			}
		}
		
	}
}
