package polymorphism;

class Upcasting {
	//If the reference variable of Parent class refers to the
	//object of Child class, it is known as upcasting.
	//	For upcasting, we can use the reference variable of class type or an interface type.
}

class Biker {
	void run() {
		System.out.println("Bike runs with a speed of 500km/h");
	}
}

class NaiveBiker extends Biker{
	void run() {
		System.out.println("Bike Runs with a speed of 40km/h");
	}
}

class SpecificBank {
	float getRateOfInterest() {
		return 0;
	}
}

class SSBI extends SpecificBank {
	float getRateOfInterest() {
		return 8.4f;
	}
	
}

class SICIC extends SpecificBank {
	float getRateOfInterest() {
		return 7.3f;
	}

}

class SAXIS extends SpecificBank {
	float getRateOfInterest() {
		return 6.8f;
	}
	
}

class Shape {
	void draw() {
		System.out.println("Draw the shape");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing the Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing the Cirlce");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing the Triange");
	}
}


class Animal {
	void eat() {
		System.out.println("eating..");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println("Drinking milk");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("eating rat...");
	}
}

class Loin extends Animal {
	void eat() {
		System.out.println("Eating meat....");
	}
}


class RPWithDataMemebers {
	//A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
	//Rule: Runtime polymorphism can't be achieved by data members.
	int speedLimit = 100;
}

class RPHonda extends RPWithDataMemebers {
	int speedLimit  = 150;
}




public class Ploymorphishm {
	
	//Polymorphism(many forms) in Java is a concept by which we can perform a single action
	//in different ways.
	
	//Compile time polymorphism
	//(If you overload a static method in Java, it is the example of compile time polymorphism.)
	//runtime polymorphism or Dynamic method dispatch(Here we focus on this)
	
	//RP is a process in which a call to overriden method is resolved at runtime rather than compile time
	

	public static void main(String[] args) {
		
		
		Biker bi = new NaiveBiker(); //Upcasting
		bi.run();
		
		//Example
		
		SpecificBank b;
		
		b = new SSBI();
		
		System.out.println("SBI rate of intrest : " + b.getRateOfInterest());
		
		b = new SICIC();
		
		System.out.println("ICIC rate of intrest : " + b.getRateOfInterest());
		
		b = new SAXIS();
		
		System.out.println("AXIS rate of Intrest : " + b.getRateOfInterest());
		
		Shape s;
		
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		
		Animal a;
		
		a = new Dog();
		
		a.eat();
		
		a = new Cat();
		a.eat();
		
		
		a = new Loin();
		a.eat();
		
		a = new Animal();
		a.eat();
		
		RPWithDataMemebers r;
		
		r = new RPHonda();
		
		System.out.println(r.speedLimit);
		
		
		//Runtime Polymorphism with Multilevel Inheritance
		
		Animal a1, a2, a3;
		
		a1 = new Animal();
		a1.eat();
		
		a2 = new Dog();
		a2.eat();
		
		a3 = new BabyDog();
		a3.eat();
		

	}

}
