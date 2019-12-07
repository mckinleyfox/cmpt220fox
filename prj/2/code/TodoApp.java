import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class TodoApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 20;
		int count = 0;
		ArrayList<String> td = new ArrayList<String>();
		int num = 0;
		int n = 0; 
		System.out.println("Type 1 to add a new task.");
		System.out.println("Type 2 print the todo list.");
		System.out.println("Type 3 to rearrange the list.");
		System.out.println("Type 4 to delete an task.")
		System.out.println("What would you like to do?");
		num = input.nextInt();
		if(num ==1 ) {
			System.out.println("Press enter between each task");
		    for (int i = count;i< max ;i++) {
		        td[i] = input.nextLine();
		        if (list[i].equals("stop")) {
		        	break;
		        	count++;
		    }
		if( num == 2) {
		        for (int index = 0;index < count; index++) {
		            System.out.println(td[index]);
		            System.out.println();
		        }   
		}
		if(num == 3) {
			System.out.println("Number your items in the list in order you want them to appear.");
			for (int i = 0; i < count; i++) {
	            for (int j = i + 1; j < count; j++) { 
	                if (n[i] > n[j]) {
	                    temp = n[i];
	                    n[i] = n[j];
	                    n[j] = temp;
	                }
	            }
	        }
		}
		if(num == 4) {
			System.out.println();
			Random ran = new Random();
			System.out.println(Reward.rewards[ran.nextInt(Reward.rewards.length)]);
		}
	}
}
