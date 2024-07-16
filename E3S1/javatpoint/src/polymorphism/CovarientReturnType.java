package polymorphism;

class example{
	example get() {
		return this;
	}
	
	void message() {
		System.out.println("Welcome to the Covarient Retrun type from example");	
	}
}


class a1 {
	a1 foo() {
		return this;
	}
	
	void print() {
		System.out.println("this is from a1");
	}
}


class a2 extends a1{
	a1 foo() {
		return this;
	}
	
	void print() {
		System.out.println("this is from a2");
	}
}


class a3 extends a1{
	a1 foo() {
		return this;
	}
	
	
	void print() {
		System.out.println("this is from a3");
	}
}

public class CovarientReturnType extends example{
	
//	The covariant return type specifies that the return type
//	may vary in the same direction as the subclass.
	
	/*
	Advantages of Covariant Return Type
	Following are the advantages of the covariant return type.

	1) Covariant return type assists to stay away from the confusing type casts in the class hierarchy and makes the code more usable, readable, and maintainable.
	
	2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.
	
	3) Covariant return type helps in preventing the run-time ClassCastExceptions on returns.
	 
	 *  */
	
	CovarientReturnType get() {
		return this;
	}
	
	void message() {
		System.out.println("Welcome to the Covarient Retrun type from main class");	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CovarientReturnType type = new CovarientReturnType();
		
		type.get().message();
		
		a1 b = new a1();
		b.foo().print();
		
		a2 b1 = new a2();
		b1.foo().print();
		
		a3 b2 = new a3();
		b2.foo().print();

	}

}
