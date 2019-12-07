import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws Exception{
		File file = new File("todo.txt");
		ArrayList<String> todo = new ArrayList<String>();
		Scanner s = new Scanner(file);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
	}
	public void readTodosToFile(ArrayList<String> todo) {
		return todo;
	}
	
}
