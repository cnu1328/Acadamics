package constructors;

public class JavaCopyWithConstructor {
	
	int id;
	String name;
	 
	//It is a special type of method which is used to initialize the object.
	
	JavaCopyWithConstructor(int num, String str) {
		id = num;
		name = str;
	}
	
	JavaCopyWithConstructor(JavaCopyWithConstructor s) {
		id = s.id;
		name = s.name;
	}
	
	//Java copy without Constructor
	
	JavaCopyWithConstructor() {};
	
	void display() {
		System.out.println(id + "   " + name);
	}

	public static void main(String[] args) {
		
		JavaCopyWithConstructor s1 = new JavaCopyWithConstructor(123, "Srinu");
		s1.display();
	
		
		JavaCopyWithConstructor s2 = new JavaCopyWithConstructor(s1);
		s2.display();
		
		JavaCopyWithConstructor s3 = new JavaCopyWithConstructor();
		
		s3.id = s1.id;
		s3.name = s1.name;
		
		s3.display();
	}

}
