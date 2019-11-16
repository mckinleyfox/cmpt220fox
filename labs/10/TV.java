package lab10q4;

public class TV extends Appliance {
	private String brand;
	private String type;
	private int size;
	public TV(String brand, String type, int size, double voltage, String color, String madeIn, double price ) {
		super(voltage, color, madeIn, price);
		this.brand = brand;
		this.type = type;
		this.size = size;
	}
	public TV(){
		super(0, "N/A", "N/A", 0);
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	public void seBrand(String brand) {
		this.brand = brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	 @Override
	   public String toString() {
	       return "TV, brand: " + brand + ", type: " + type + ", size: " + size + ", price: " + getPrice();
	   }
	  
}
