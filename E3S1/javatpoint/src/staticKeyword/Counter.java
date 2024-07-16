package staticKeyword;

public class Counter {
	
	//The static keyword in Java is used for memory management mainly.
	//We can apply static keyword with variables, methods, blocks and nested classes.
	//The static keyword belongs to the class than an instance of the class.
	
	//The static variable can be used to refer to the common property of all objects 
	//The static variable gets memory only once in the class area at the time of class loading.
	
	//Java Static Method
	//If you apply static keyword with any method, it is known as static method.
	
	//A static method belongs to the class rather than the instances of a class.
	//A static method can be invoked without the need for creating an instance of a class.
	//A static method can access static data member and can change the value of it.
	
	
	//Java static block
	//Is used to initialize the static data member.
	//It is executed before the main method at the time of classloading.

	int a;
	static int count = 0;
	
	Counter() {
		count++;
		System.out.println(count);
	}
	
	static int calculate(int x) {
		return x*x*x;
	}
	
	static {
		System.out.println("Static Block is Invoked");
	}

	public static void main(String[] args) {
		new Counter();
		new Counter();
		
		int x = Counter.calculate(4);
		System.out.println(x);
		System.out.println(count);
//		System.out.println(a); //a is non-static memeber.
		
		
	}

}
