
public class Bond {
	public static void main(String[] args) {
		Bond test = new Bond(500, 100, .05, 10,000);
		System.out.println("The price of the bond is: " + test.getPrice());
	}
	private double coupon;
	private int payments;
	private double interest;
	private double valueMaturity;
	Bond(){
		coupon = 0;
		payments = 0;
		interest = 0;
		valueMaturity = 0;
		}
	Bond(double c, int n, double i, double M){
		coupon = c;
		payments = n;
		interest = i;
		valueMaturity = m;
	}
	public static double getPrice() {
		double price;
		price = (coupon * ( 1-(1/Math.pow(1+interest, payments)))) + (valueMaturity*(1/Math.pow(1+interest, payments))); // JA
		return price;
	}
	
}
