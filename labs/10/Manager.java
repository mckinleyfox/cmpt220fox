// JA: To use this clss in problem 2 you need a different constructor
public class Manager implements Printable{
	private String name;
	private long number;
	public Manager( String name, long number) {
		this.name = name;
		this.number = number;
	}
	public void print() {
		System.out.println("Manager : name "+ name +", number : "+ number);
	}
}
