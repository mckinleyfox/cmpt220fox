
public class Account {
	private int accountNum;
	private double balance;
	private double annualIntRate;
	private java.util.Date dateCreated = new java.util.Date();
	
	public Account() {
		java.util.Date dateCreated = new java.util.Date();
	}
	
	public Account(int an, double bal, double rate) {
		an = accountNum;
		balance = bal;
		annualIntRate = rate;
	}
	
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualIntRate() {
		return annualIntRate;
	}
	
	public double setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	public double deposit(double deposit) {
		balance += deposit;
		return deposit;
	}
	
	public double withdraw(double withdraw) {
		this.balance -= withdraw;
		return withdraw;
	}
	
	
	
}
