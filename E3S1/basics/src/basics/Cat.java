package basics;

public class Cat extends Dog{
	private int food;

	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	
	public Cat(String name) { 
		super(name, 0);
		this.food = 50;
	}
	
	public void speak() {
		System.out.println("My name is " + this.name + ". My age is " + this.age + " and Today I ate " + this.food + " of grams");
	}
	
	public void eat(int food) {
		this.food = food;
	}

}
