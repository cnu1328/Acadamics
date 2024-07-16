package staticKeyword;

public class Student {
	
	
	
	int rolln;
	String name;
	static String college = "RGUKT-BASAR";
	
	static void change() {
		college = "RGUKT-B";
	}
	
	Student(int num, String str) {
		rolln = num;
		name = str;
	}
	
	void display() {
		System.out.println(rolln + "   " + name + "  " + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(123, "Srinu");
		s.display();
		
		Student s2 = new Student(145, "Harish");
		s2.display();
		
		change();
		
		Student s3 = new Student(146, "Vishnu");
		s3.display();
		

	}

}
