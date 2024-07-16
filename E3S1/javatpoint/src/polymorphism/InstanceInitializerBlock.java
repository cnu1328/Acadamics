package polymorphism;


class Bike1{
	int speed;
	
	Bike1() {
		//the things will happen to which is invoked first
		
		//super(); //if parent is present
		//{speed = 100; System.out.println("instance initializer invoded"};
		
		System.out.println("Constructor is invoked");
		System.out.println("Speed is : "  + speed);
		
	}
	
	{speed = 100;
	 System.out.println("Intance initializer Invoked");
	}
	
}


class Parent {
	Parent() {
		System.out.println("Parent class constructer is invoked");
	}
}

class Child extends Parent{
	Child() {
		System.out.println("Child class contructor is invoked");
	}
	
	Child(int a) {
		System.out.println("Child class contructor is invoked " + a);
	}
	
	{System.out.println("Instance Initializer class is invoked");}
}

public class InstanceInitializerBlock {
	
	//Here are three places in java where you can perform operations:
	//method
	//constructor
	//block
	
	
	/*The instance initializer block is created when instance of the class is created.
	  The instance initializer block is invoked after the parent class constructor is
	  invoked (i.e. after super() constructor call).
	  The instance initializer block comes in the order in which they appear.
	 */

	public static void main(String[] args) {
		
		new Bike1();
		new Bike1();
		System.out.println();
		new Child();
		System.out.println();
		new Child(10);
	}

}
