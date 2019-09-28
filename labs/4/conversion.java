
public class conversion {
	public static void main(String[] args) {
		System.out.print(" " + "in" + " " + "cm" + " " + "|" + "  " + "cm"+ "  " + "in");
		System.out.println("-----------------------");
		for(int in = 1; in < 51; in++) {
			double cm = in * 2.54;
			int cent = in * 5-4;
			double inch = cent/2.54;
			System.out.printf("%3d %5.2f | %3d %5.2f\n", in, cm, cent, inch);
		}
	}
}
