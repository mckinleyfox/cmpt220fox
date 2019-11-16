package lab10q4;

public class Toaster extends Appliance{
	private String brand;
	private long modelNum;
	private boolean isOven;
	public Toaster(String brand, boolean isOven , long modelNum, double voltage, String color, String madeIn, double price ) {
		super(voltage, color, madeIn, price);
		this.brand = brand;
		this.modelNum = modelNum;
		this.isOven = isOven;
	}
	public Toaster(){
		super(0, "N/A", "N/A", 0);
	}
	public String getBrand() {
		return brand;
	}
	public long getmodelNum() {
		return modelNum;
	}
	public boolean getisOven() {
		return isOven;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setmodelNum(long modelNum) {
		this.modelNum = modelNum;
	}
	public void setisOven(boolean isOven) {
		this.isOven = isOven;
	}
	 @Override
	 public String toString() {
		 return "Toaster, brand: " + brand + ", model number: " + modelNum + ", is it a toaster oven: " + isOven + ", price: " + getPrice();
	 }
	  
}
