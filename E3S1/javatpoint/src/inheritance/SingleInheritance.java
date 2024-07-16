package inheritance;

//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors
//of a parent object. It is an important part of OOPs (Object Oriented programming system).

//Inheritance represents the IS-A relationship which is also known as a parent-child relationship.


//Class: A class is a group of objects which have common properties.
//It is a template or blueprint from which objects are created.


//Sub Class/Child Class: Subclass is a class which inherits the other class.
//It is also called a derived class, extended class, or child class.


//Super Class/Parent Class: Superclass is the class from where a subclass inherits the features
//. It is also called a base class or a parent class.


//Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields
//and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

//Single Inheritance
class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

//Multilevel Inheritance

class babyDog extends Dog{
	void weep() {
		System.out.println("Weeping...");
	}
}

//Hierarchical Inheritance

class Cat extends Animal {
	void meow() {
		System.out.println("Meow...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.eat();
		d.bark();
		
		System.out.println("\nMultilevel Inheritance :");
		babyDog b = new babyDog();
		b.eat();
		b.bark();
		b.weep();
		
		System.out.println("\nHierarhical Inheritance : ");
		
		Cat c = new Cat();
		
		c.meow();
		c.eat();

	}

}
