
public class SportCar implements Printable{
	private String brand;
	private int num;
	public SportCar(String brand, int num) {
		this.brand = brand;
		this.num = num;
	}
	public void print() {
		System.out.println("Sports Car : brand "+ brand +", number : "+ num);
	}
}
