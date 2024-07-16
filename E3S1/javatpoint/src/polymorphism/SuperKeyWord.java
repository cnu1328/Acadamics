package polymorphism;

class Animal1 {
	String color = "Brown";
	
	Animal1() {
		System.out.println("Animal class is created");
	}
	
	void eat() {
		System.out.println("eating veg");
	}
}

class Dogs extends Animal1 {
	String color = "white";
	
	Dogs() {
		//super();
		
		System.out.println("Dog class is created");
	}
	
	void eat() {
		System.out.println("eating non-veg");
	}
	
	void bark() {
		System.out.println("Barking...");
	}
	
	void work() {
		eat();
		super.eat();
		bark();
	}
	
	void printColor() {
		System.out.println("color of the dog : " + color);
		System.out.println("Color of the animal : " + super.color);
	}
}

//Real example of the super key word

class Person {
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}


class Emp extends Person{
	double salary;
	
	Emp(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		
	}
	
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class Worker extends Person{
	double wage;
	
	Worker(int id, String name, double wage) {
		super(id, name);
		this.wage = wage;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + wage);
	}
}




public class SuperKeyWord {
	
	//super is used to refer immediate parent class instance variable
	// super can be used to invoke parent class method

	public static void main(String[] args) {
		
		Dogs d = new Dogs();
		
		d.printColor();
//		
		d.eat();
		d.work();
//		
		Emp emp = new Emp(1234, "srinu", 100.0);
		emp.display();
		
		Worker work = new Worker(12345, "Vishnu", 1000.2);
		work.display();

	}

}
