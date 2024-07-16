package account;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.insert(345232, "Srinivas", 1000);
		
		a.display();
		
		a.checkBalance();
		
		a.deposit(100);
		
		a.checkBalance();
		
		a.withdraw(1200);
		
		a.withdraw(1100);
		
		a.checkBalance();
		
	}
}
