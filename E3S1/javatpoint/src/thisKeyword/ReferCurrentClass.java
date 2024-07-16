package thisKeyword;


//Usage of Java this keyword
//Here is given the 6 usage of java this keyword.

//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.

class Student{
	int rollno;
	String name;
	float fee;
	
	Student(int rollno, String name, float fee) {
		
		//Here all three variables are local variables so, they are overwriting 
		//Themselves but not storing in instance variables.
		//to store in instance variables, use this key
		
		
		//This keyword is a reference variables which refers to the 
		//Current class instance variables.
		
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		
		
	}
	
	void display() {
		System.out.println(rollno + "  " + name + "   " + fee);
	}
}

public class ReferCurrentClass {

	public static void main(String[] args) {
		Student c = new Student(3, "Srinu", 10f);
		c.display(); //I Will get 0 null 0.0 >> Now you will correct answer.

	}

}
