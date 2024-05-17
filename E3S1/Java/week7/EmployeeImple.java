interface Payable {
	double getAmount(double salary);
}

class Invoice implements Payable {
	public double getAmount(double salary) {
		return salary + 100;
	}
}

class Employee implements Payable {
	public double getAmount(double salary) {
		return salary + 20;
	}
}

public class EmployeeImple {
    public static void main(String[] args) {
	Invoice i = new Invoice();	
	System.out.println("Invoice amount : " + i.getAmount(100));

	Employee e = new Employee();
	System.out.println("Employee amount : " + e.getAmount(20));
	
    }
}