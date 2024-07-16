package polymorphism;



class Meow {
	void action() {
		System.out.println("Cat doing an action");
	}
}

class StaticAndDynamicBinding extends Meow{
	
//	Connecting a method call to the method body is known as binding.
	
//		There are two types of binding

//		Static Binding (also known as Early Binding).
//		Dynamic Binding (also known as Late Binding).
	
	
//	Static Binding : When type of the object is determined at compiled time, is known as static binding.
//	Dynamic Biding : When type of the object is determined at run-time is known as dynamic binding
	
	
	void action() {
		System.out.println("Dog is doing an action");
	}
	
	private void eat() {
		
//		When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//		If there is any private, final or static method in a class, there is static binding.
		
		System.out.println("Eating...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndDynamicBinding s = new StaticAndDynamicBinding();
		s.eat();
		
		Meow m;
		
		m = new Meow();
		
		m.action();
		
	}

}
