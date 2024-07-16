package thisKeyword;

class Example{
	void mhello() {
		System.out.println("Hello m");
	}
	
	void nhello() {
		System.out.println("Hello n");
		//mhello() same as this.mhello();
		mhello();
	}
}

public class InvokeCurrentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example a = new Example();
		a.nhello();

	}

}
