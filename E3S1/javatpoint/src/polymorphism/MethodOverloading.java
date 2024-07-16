package polymorphism;

public class MethodOverloading {
	
	//If a class has multiple methods having same name 
	//but different in parameters, it is known as Method Overloading
	
	//Method overloading by number of parameters
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	
	//Method Overloading by changing the data type
	
	static int adder(int a, int b) {
		return a+b;
	}
	
	static double adder(double a, double b) {
		return a+b;
	}
	
	//To check Method Overloading is possible by only changing
	//REturn type => it gives ambiguity
	
//	static int sum(int a, int b) {
//		return a+b;
//	}
//	
//	static double sum(int a, int b) {
//		return a+b;
//	}
	
	//Method overloading and type promotion
	
	//If there are matching type arguments in the method, type promotion is not performed.
	
	static long addition(int a, long b) {
		return a+b;
	}
	
	static double addition(int a, double b, int c) {
		System.out.println(c);
		return a+b+c;
	}
	
	//if there are no matching type arguments in the method, 
	//and each method promotes similar number of arguments, 
	//there will be ambiguity.
	
	static void concat(int a, long b) {
		System.out.println("1st One : " + a+b);
	}
	
	static void concat(long a, int b) {
		System.out.println("2nd One " + a+b);
	}
		
	public static void main(String[] args) {
		System.out.println("The Main with String array");
		
		// TODO Auto-generated method stub
		System.out.println(MethodOverloading.add(12,13));
		System.out.println(MethodOverloading.add(12, 13, 14));
		System.out.println(MethodOverloading.adder(12, 13));
		System.out.println(MethodOverloading.adder(5.0, 5));
		
		//System.out.println(MethodOverloading.sum(10, 20));
		System.out.println(MethodOverloading.addition(10,30));
		
		System.out.println(MethodOverloading.addition(10, 30, 'z'));
		
//		MethodOverloading.concat(20, 30);
	}
	
	//Can we overload java main() method?
	
	public static void main(String args) {
		System.out.println("The main with String");
	}
	
	public static void main() {
		System.out.println("The main with emtpy");
	}double getPeriment() {
		return 0.0;
	   };

}
