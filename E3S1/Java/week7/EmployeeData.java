abstract class Employee {
	abstract double getAmount(double hours);
}

class Hourly extends Employee{
	double getAmount(double hours) {
		return hours*10;
	}
}

class Weekly extends Employee {
	double getAmount(double weeks) {
		return weeks*70;
	}
}

public class EmployeeData {
    public static void main(String[] args) {
	Weekly w = new Weekly();

	System.out.println("Weekly  Amount : " + w.getAmount(2));

	Hourly h = new Hourly();

	System.out.println("Hourly Amount : " + h.getAmount(2));
    }
}