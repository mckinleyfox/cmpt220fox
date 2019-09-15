class lab1q2 { // JA: This name has to match the name of the file
	public static void main(String[] args){
		double num = 1; // JA: Otherwise the terms become 0 because it is integer division
		System.out.print(4*((1/num)-(1/(num+2))+(1/(num+4))-(1/(num+6))+(1/(num+8))-(1/(num+10))));
	}
}