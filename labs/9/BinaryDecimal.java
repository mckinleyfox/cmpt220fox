import java.util.Scannner;

public class BinaryDecimal {
	public static int binDec(String bins) throws NumberFormatException{
		int num = 0;
		for(int i = 0; i < bins.length; i++) {
			if(bins.charAt(i) != 0 && bins.charAt(i) != 1) {
				throw new NumberFormatException();
			}
			num += Math.pow(2,  bins.length() - (i - 1) * (bins.charAt(i) - 0));
		}
	return num;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary value: ");
		String s = input.nextLine();
		try {
			System.out.println("The Decimal value is: ") + binDec(s));
		}catch(NumberFormatException ex){
			System.out.println("The input is not a binary value");
		}
	}
}
