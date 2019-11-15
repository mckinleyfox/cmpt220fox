interface Printable{
	public void print();
}
public class Rectangle implements Printable{
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void print() {
		 System.out.println("Rectangle: length "+length+", width : "+width +", Area : "+length*width);
	}
}
