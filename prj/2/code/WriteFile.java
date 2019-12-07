import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
	public static void main(String[] args) {
		BufferedWriter writer = null;
		ArrayList<String> todos = new ArrayList<String>();
		try {
			String content = "The Todo List will be saved to the following file: ";
			File file = new File("todo.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter f = new FileWriter(file);
			writer = new BufferedWriter(f);
			writer.write(content);
			System.out.println("File was written");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer != null) {
					writer.close();
				}
			}catch(Exception ex) {
				System.out.println("Something went wrong in closing the BufferWriter" + ex);
			}
		}
	}
	public void writeTodosToFile(ArrayList<String> todos) {
		return todos;
	}
}
