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
		for(int j = 0 ; j < numbers.size() ; j++) {
			System.out.println("The list after sorting is: " + numbers.get(j));
		}
	}
	public static void sort(ArrayList<Integer> numbers) {
		int temp;
		for(int i = 0; i < numbers.size() ; i++) {
			for(int j =0 ;j < numbers.size() ; j++) {
				if(numbers.get(j).intValue() > numbers.get(j++).intValue()){
					temp = numbers.get(j++);
					numbers.set(j++, numbers.get(j));
					numbers.set(j,  temp);
				}
			}
		}
		
	}
}
