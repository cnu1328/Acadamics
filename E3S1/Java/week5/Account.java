
public class Account {
	
	int acc_no;
	String name;
	double amount;
	String address;

	Account(int acc_no, String name, double amount, String address) {
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
		this.address = address;
	}
	
	
	void deposit(double amt) {
		amount += amt;
		System.out.println(amt + "  deposited");
	}
	
	void withdraw(double amt) {
		if(amount < amt) {
			System.out.println("Insufficient Balance");
			
		}
		
		else {
			amount -= amt;
			System.out.println(amt + " Withdrawn");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance is : " + amount);
	}
	
	void display() {
		System.out.println(acc_no + "   " + name + "    " + amount);
	}

	public static void main(String[] args) {
		Account a =  new Account(1, "Srinu", 100, "Chengal");
		a.checkBalance();
		a.display();
		a.withdraw(50);
		a.deposit(50);
	}		
	
	
	
}
