package abstraction;

interface Printable {
	
	//The Java compiler adds public and abstract keywords before the interface method. 
	//Moreover, it adds public, static and final keywords before data members.
	
	void print();  //after compilation => public abstract void print();
}

class Hello implements Printable {
	public void print() {
		System.out.println("Hello....");
	}
}

interface Drawable {
	void draw();
	
	//we can have method body in interface. But we need to make it default method.
	
	default void print() {
		System.out.println("It happend with default");
	}
	
//	we can have static method in interface.
	
	static int cube(int n) {
		return n*n*n;
	}
}

class Rectangles implements Drawable {
	public void draw() {
		System.out.println("Drawing the Rectangle");
	}
}

class Circles implements Drawable {
	public void draw() {
		System.out.println("Drawing the Circle");
	}
}

interface Account {
	float rateOfInterest();
}

class HDFC implements Account {
	public float rateOfInterest() {
		return 6.8f;
	}
}

public class Interface {
	
//	An interface in Java is a blueprint of a class. It has static constants and abstract methods.

//	The interface in Java is a mechanism to achieve abstraction.
//	There can be only abstract methods in the Java interface, not method body.
//	It is used to achieve abstraction and multiple inheritance in Java and loose coupling
	
//	It also represents the IS-A relationship and cannot be instantiated just like the abstract class.
	
	
	// class ---Extends------->  class
	// class ---implements---->  interface
	// interface ---Extends------->  interface



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h = new Hello();
		h.print();
		
		Rectangles r = new Rectangles();
		r.draw();
		r.print();
//		int n = 3;
//		System.out.println(n);
		System.out.println(Drawable.cube(2));
		
		Circles c = new Circles();
		c.draw();
		
		Account s = new HDFC();
		
		System.out.println("Rate of Intrest : " + s.rateOfInterest());
		
		
	}

}
