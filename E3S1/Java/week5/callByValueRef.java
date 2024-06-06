class Operation {
	int data = 50;

	void change(int data) {
		this.data = data + 100;
	}

	void change(Operation op) {
		op.data = 10;
	}

	
	public static void main(String[] args) {
		Operation op = new Operation();
		System.out.println("before change "+op.data);  
		op.change(10);
		System.out.println("before change "+op.data);  

		System.out.println("before change "+op.data);  
		op.change(op);
		System.out.println("before change "+op.data);
	}
}