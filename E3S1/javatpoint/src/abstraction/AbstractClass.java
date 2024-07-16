package abstraction;

abstract class Bike {
	Bike() {
		System.out.println("Bike Object is created");
	}
	
//	A method which is declared as abstract and does not have implementation is known as an abstract method.
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear changed");
	}
}

class Honda extends Bike {
	
	void run() {
		System.out.println("Running Safely");
	}
	
}


abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

abstract class Bank {
	abstract int rateOfIntrest();
}

class SBI extends Bank {
	int rateOfIntrest() {
		return 7;
	}
}

class PNB extends Bank {
	int rateOfIntrest() {
		return 8;
	}
}

public class AbstractClass {
	
//	Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//	Another way, it shows only essential things to the user and hides the internal details,
//	for example, sending SMS where you type the text and send the message. 
	//You don't know the internal processing about the message delivery.

	
//	There are two ways to achieve abstraction in java

//	Abstract class (0 to 100%)
//	Interface (100%)
	
//	A class which is declared as abstract is known as an abstract class.
//	It can have abstract and non-abstract methods.
//	It needs to be extended and its method implemented. It cannot be instantiated
	
//	Rules for java Abstract Class
	
//	An abstract class must be declared with an abstract keyword.
//	It can have abstract and non-abstract methods.
//	It cannot be instantiated.
//	It can have constructors and static methods also.
//	It can have final methods which will force the subclass not to change the body of the method.
	
	public static void main(String[] args) {
		Bike b = new Honda(); //upcasting
		
		b.run();
		b.changeGear();
		
		
		Shape s = new Rectangle();
		s.draw();
		
		s = new Circle();
		
		s.draw();
		
		Bank bk = new SBI();
		
		System.out.println(bk.rateOfIntrest());
		
		bk = new PNB();
		
		System.out.println(bk.rateOfIntrest());
		
	}

}
