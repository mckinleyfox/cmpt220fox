package lab10q4;

public class Telephone extends Appliance {
	private String brand;
	private int series;
	private String provider;
	public Telephone(String brand, int series , String provider, double voltage, String color, String madeIn, double price ) {
		super(voltage, color, madeIn, price);
		this.brand = brand;
		this.series = series;
		this.provider = provider;
	}
	public Telephone(){
		super(0, "N/A", "N/A", 0);
	}
	public String getBrand() {
		return brand;
	}
	public int getseries() {
		return series;
	}
	public String getprovider() {
		return provider;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setseries(int series) {
		this.series = series;
	}
	public void setprovider(String provider) {
		this.provider = provider;
	}
	 @Override
	 public String toString() {
		 return "Toaster, brand: " + brand + ", series: " + series + ", phone provider: " + provider + ", price: " + getPrice();
	 }
}
