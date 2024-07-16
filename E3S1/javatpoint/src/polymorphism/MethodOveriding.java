package polymorphism;

class Vechile {
	void run() {
		System.out.println("Vechile is Running");
	}
}

class Bike extends Vechile {
	
	void run() {
		System.out.println("Bike is Running Safetly");
	}
	
}

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}

class ICIC extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

class Axis extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class MethodOveriding {
	
	//If subclass (child class) has the same method as declared
	//in the parent class, it is known as method overriding in Java.
	
	//Rules for Java method Overriding
	
	//The method must have the same name as in the parent class
	//The method must have the same parameter as in the parent class.
	//There must be an IS-A relationship (inheritance).

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bike bike = new Bike();
		bike.run(); //First Vechile is Running. After overriding it prints Bike is running safely
		
		//Method Overriding with real example
		
		SBI sbi = new SBI();
		ICIC icic = new ICIC();
		Axis axis = new Axis();
		
		System.out.println("SBI bank Rate of Interest is : " + sbi.getRateOfInterest());
		System.out.println("SBI bank Rate of Interest is : " + icic.getRateOfInterest());
		System.out.println("SBI bank Rate of Interest is : " + axis.getRateOfInterest());
		
		
		
		
		
		
	}

}
