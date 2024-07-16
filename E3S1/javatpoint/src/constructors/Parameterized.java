package constructors;

public class Parameterized {
	
	String str;
	int id;
	
	Parameterized(String s, int num) {
		str = s;
		id = num;
	}
	
	//Construct Overloading
	
	Parameterized(String s) {
		str = s;
		id = 0;
	}
	
	Parameterized(int num) {
		str = "No name";
		id = num;
	}
	
	Parameterized() {
		str = "No name ";
		id = 0;
	}
	
	
	void display() {
		System.out.println(str + "  " + id);
	}
	
	
	public static void main(String[] args) {
		Parameterized stu = new Parameterized("Srinu", 123);
		Parameterized stu1 = new Parameterized("Srinu");
		Parameterized stu2 = new Parameterized(143);
		Parameterized stu3 = new Parameterized();
		
		
		
		stu.display();
		stu1.display();
		stu2.display();
		stu3.display();

	}

}
