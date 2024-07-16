package thisKeyword;

class Value{
	Value() {
		this(10);
		System.out.println("Hello A");
	}
	
	Value(int x) {
		//this();
		System.out.println(x);
	}
}

class Student1 {
	  
	int rollno;
	String name, course;
	float fee;
	
	Student1(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	Student1(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
		
	}
	
	void display() {
		System.out.println(rollno + "    " + name + "   " + course + "    " + fee);
	}
}

public class ToInvokeCurrentClassConstructor {

	public static void main(String[] args) {
		
		new Value();
		
		Student1 st = new Student1(1234, "Srinu", "Java");
		st.display();
		
		Student1 stu = new Student1(1446, "mahesh", "DBMS", 20f);
		stu.display();
		

	}

}
