import java.until.Scanner;

public class primeCalc {
	public static void main(String[] args) {

		int less = 15000;
		for(int i = 15000; i < num; i--) {
			if(isPrime(num)) {
				print("The largest prime number is " + num);
			}
		}
				
	}
	
	boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
