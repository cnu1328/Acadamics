package abstraction;

interface printer {
	void print();
}

interface showable {
	void print();
	void show();
	
}


class function implements printer, showable {
	
	public void print() {
		System.out.println("It is used to Print The Data");
	}
	
	public void show() {
		System.out.println("It is used to show the data");
	}
	
}

public class MultipleInheritance {
	
	//If a class implements multiple interfaces, or an interface extends multiple interfaces,
	//it is known as multiple inheritance.

	public static void main(String[] args) {
		function func = new function();
		
		func.print();
		func.show();
	}

}
