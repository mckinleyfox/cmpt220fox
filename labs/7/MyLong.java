// No test class?
public class MyLong {
	private Long value;
	public MyLong(Long value) {
		this.value = value;
	}
	public Long getValue() {
		return value;
	} 
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	public boolean isOdd() {
		if(value % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	public boolean isPrime() {
		for(int i = 0; i*i <= value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	public boolean isEven(long value) {
		if(value % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	public boolean isOdd(long value) {
		if(value % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	public boolean isPrime(long value) {
		for(int i = 0; i*i <= value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	public boolean isEven(MyLong mylo) {
		if(mylo.getValue() % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	public boolean isOdd(MyLong mylo) {
		if(mylo.getValue() % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	public boolean isPrime(MyLong mylo) {
		for(int i = 0; i*i <= value; i++) {
			if(mylo.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static long parseLong(char chars[]) {
		String s = " ";
		for(int i =0; i < chars.length; i++) {
			s += chars[i];
		}
		return parseLong(s);
	}
	public static long parseLong(String s) {
		return Long.parseLong(s);
	}
}
