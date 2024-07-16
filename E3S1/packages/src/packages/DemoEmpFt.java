package packages;

import commercial.java.a2023.*;
import javaPackage.*;

public class DemoEmpFt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		EmployeeFtp e2 = new EmployeeFtp();
		
		e1.setId(1234);
		e2.setId(1453);
		e2.setSarlay(1000);
		
		System.out.println("Employee Id : " + e1.getId());
		System.out.println("Employee Ft Id : " + e2.getId());
		System.out.println("Salary of Ft Employee : " + e2.getSarlay());

	}

}
