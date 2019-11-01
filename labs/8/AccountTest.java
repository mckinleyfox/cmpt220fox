
public class AccountTest {
	public static void main(String[] args) {
		Account mainAccount = new Account(372970278, 5000, 3.2);
		Account check = new CheckingsAccount();
		Account saving = new SavingsAccount();
		
		mainAccount.deposit(100);
		mainAccount.withdraw(35);
		
		System.out.println("Account Number: " + mainAccount.getAccountNum());
		System.out.println("Balance: " + mainAccount.getBalance());
		System.out.println("Annual Interest Rate: " + mainAccount.getAnnualIntRate());
		System.out.println("Date created: " + mainAccount.getDateCreated());
		System.out.println("toString: " + mainAccount.toString());
		System.out.println("toString: " + checkings.toString());
		System.out.println("toString: " + savings.toString());
	}
}
