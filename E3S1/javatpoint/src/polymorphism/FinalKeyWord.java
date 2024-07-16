package polymorphism;

/*final*/ class Car {
	/*final*/ void run() {
		System.out.println("The Car is running");
	}
	
	final void checkSpeed() {
		System.out.println("Running Faster ");
	}
}

class Bike2 extends Car{
	final int speedLimit = 100;
	final int bikeNo;
	
	static int cube(final int n) {	
		return n*n*n;
	}
	
	Bike2() {
		bikeNo = 100;
		System.out.println(bikeNo);
	}
	
	void run() {
		//speedLimit = 140; //Speedlimit is can't assigined again, because of final
		System.out.println("Bike class " + speedLimit);
	}
	
	
}




public class FinalKeyWord {
	
	//The final keyword in java is used to restrict the user.
	//Stop value Change
	//Stop Method Overriding
	//Stop Inheritance -> It stops inherit of class, but not method.
	//Final method inheritance is possible, but overriding is not possible
	
	static final int data;
	
	static {
		data = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Bike2().run();
		new Bike2().checkSpeed();
		Car c = new Car();
		c.run();
		
		System.out.println(FinalKeyWord.data);
		
		System.out.println(Bike2.cube(5));
	
	}

}
