package packages;

public class Account {
	private long account_no;
	private String name, email;
	private float amount;
	
	//Public getter and setter methods
	
	public long getAccount_no() {
		return account_no;
	}
	
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
