class Employee1 {
	String firstname;
	String lastname;

	Employee1(String first, String last) {
		firstname = first;
		lastname = last;
	}

	String getFirstName() {
		return firstname;
	}

	String getLastName() {
		return lastname;
	}
}

class Cemployee extends Employee1 {
	String dept;
	String desg;
	double salary;

	Cemployee(String first, String last, String dept, String desg, double salary) {
		super(first, last);		
		this.dept = dept;
		this.desg = desg;
		this.salary = salary;
	}

	String displayFullName() {
		return super.getFirstName() + " " + super.getLastName();
	}

	String getDept() {
		return dept;
	}	

	String getDesg() {
		return desg;
	}
	
	void display() {
		System.out.println("Contract Employee : ");
		System.out.println("Full Name : " + displayFullName());
		System.out.println("Department : " + getDept());
		System.out.println("Designation : " + getDesg());
		System.out.println("Salary : " + salary);
		
	}
}

class HourlyEmployee extends Cemployee {
	int hours;
	double wage;

	HourlyEmployee(String first, String last, String dept, String desg, int hours, double wage) {
		super(first, last, dept, desg, 0);	
		this.hours = hours;
		this.wage = wage;	
		
	}

	
	String getDesg() {
		return "Hourly Contract Employee";
	}

	double CalculateWage() {
		return 30*hours*wage;
	}

	void display() {
		System.out.println("Hourly Employee : ");
		System.out.println("Full Name : " + displayFullName());
		System.out.println("Department : " + getDept());
		System.out.println("Designation : " + getDesg());
		System.out.println("Monthly Salary : " + CalculateWage());
		
	}
}

class WeeklyEmployee extends Cemployee {
	int weeks;
	double wage;

	WeeklyEmployee(String first, String last, String dept, String desg, int hours, double wage) {
		super(first, last, dept, desg, 0);	
		this.weeks = hours;
		this.wage = wage;	
		
	}
	

	String getDesg() {
		return "Weekly Contract Employee";
	}


	double CalculateWage() {
		return weeks*wage;
	}

	void display() {
		System.out.println("Weekly Employee : ");
		System.out.println("Full Name : " + displayFullName());
		System.out.println("Department : " + getDept());
		System.out.println("Designation : " + getDesg());
		System.out.println("Monthly Salary : " + CalculateWage());
		
	}
}

class Remployee extends Employee1 {
	String dept;
	String desg;
	double salary;

	Remployee(String first, String last, String dept, String desg, double salary) {
		super(first, last);		
		this.dept = dept;
		this.desg = desg;
		this.salary = salary;
	}

	String displayFullName() {
		return super.getFirstName() + " " + super.getLastName();
	}

	String getDept() {
		return dept;
	}	

	String getDesg() {
		return desg;
	}

	void display() {
		System.out.println("Regular  Employee : ");
		System.out.println("Full Name : " + displayFullName());
		System.out.println("Department : " + getDept());
		System.out.println("Designation : " + getDesg());
		System.out.println("Salary : " + salary);
		
	}
}

public class Employee {
	public static void main(String[] args) {
		WeeklyEmployee c = new WeeklyEmployee("Srinu", "Dharpally", "CSE", "FULL", 2, 10);
		c.display();
	}
}