package basics;
//import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
//		
//		int x = 5;
//		
//		String str = "Hello";
		
//		srinu("Mahesh");
//		System.out.println(good(3));
//		System.out.println(str("Srinu"));
		
		
		//Creating classes
		
		Dog kutti = new Dog("Kutti", 5);
		kutti.speak();
		
		Dog baggi = new Dog("Baggi", 10);
		baggi.speak();
		
		
		System.out.println(kutti.getAge());
		
		kutti.setAge(6);
		
		System.out.println(kutti.getAge());
		kutti.speak();
		
		
		//Inheritance
		System.out.println();
		System.out.println("    INHERITANCE   ");
		
		Cat kimmy = new Cat("Kimmy", 10, 100);
		kimmy.speak();
		
		kimmy.eat(200);
		
		kimmy.speak();
		
		Cat mum = new Cat("MUMMY", 10);
		Cat man = new Cat("HUman");
		

		mum.speak();
		man.speak();
		
		
		//What does static mean?
		
		Dog kutti1 = new Dog("Kutti", 5);
		Dog baggi1 = new Dog("Baggi", 10);
		
		System.out.println(Dog.count); 
		
		//Overloading Methods and Object Comparisons
		
		
		
	}
	
	public static void srinu(String str) {
		System.out.println(str);
	}
	
	public static int good(int x) {
		return x*x;
	}
	
	public static String str(String s) {
		return s + " Adding other string";
	}

}
