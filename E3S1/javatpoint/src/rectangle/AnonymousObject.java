package rectangle;

public class AnonymousObject {
	
	void fact(int n) {
		int fact = 1;
		
		for(int i=2; i<=n; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial is : " + fact);
	}

	public static void main(String[] args) {
		
		new AnonymousObject().fact(5);
		new AnonymousObject().fact(10);

	}

}
