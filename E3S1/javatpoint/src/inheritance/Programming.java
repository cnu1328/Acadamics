package inheritance;

class Employee {
	float salary = 400000;
}

public class Programming extends Employee {
	float bonus = 5000;
	
	
	public static void main(String[] args) {
		Programming p = new Programming();
		System.out.println("Salary of the employee : " + p.salary);
		System.out.println("Bonus Achieved by the programmer is : " + p.bonus);
	}
}
