
public class conversion {
	public static void main(String[] args) {
		System.out.println(" " + "in" + " " + "cm" + " " + "|" + "  " + "cm"+ "  " + "in"); // JA
		System.out.println("-----------------------");
		for(int in = 1, cent = 1; in < 51; in++, cent += 5) { // JA
			double cm = in * 2.54;
			//int cent = in * 5-4;
			double inch = cent/2.54;
			System.out.printf("%3d %5.2f | %3d %5.2f\n", in, cm, cent, inch);
		}
	}
}
