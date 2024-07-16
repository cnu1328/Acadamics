package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
    int emp_id;
    String emp_name;
    int emp_age;
    String emp_gender;
    String emp_dest;
    double  emp_salary;
    String emp_address;
    
    Employee(int num, String name, int age, String gender, String dest, double salary, String address) {
	   	emp_id = num;
	   	emp_name = name;
	   	emp_age = age;
	   	emp_gender = gender;
	   	emp_dest = dest;
	   	emp_salary = salary;
	   	emp_address = address;

    }
    
    int getId() {
    	return emp_id;
    }


    void display() {
		System.out.println("Employee Details : ");
	
		System.out.println("ID          : " + emp_id);
		System.out.println("Name        : " + emp_name);
		System.out.println("Age         : " + emp_age);
		System.out.println("Gender      : " + emp_gender);
		System.out.println("Designation : " + emp_dest);
		System.out.println("Salary      : " + emp_salary);
		System.out.println("Address     : " + emp_address);
    }

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID number of the Employer : ");	
		int inputId = sc.nextInt();
		
		employees.add(new Employee(1234, "Srinu", 19, "Male", "Student", 100.00, "Basar"));
		employees.add(new Employee(1221, "Swathi", 17, "Female", "Student", 200.00, "Basar"));
		employees.add(new Employee(1416, "Vishnu", 19, "Male", "Student", 300.00, "Basar"));
	
		
		boolean flag = false;
		for(Employee employee : employees) {
		     if(employee.getId() == inputId) { 
				employee.display();
				flag = true;
		     } 
		}
		
		if(flag == false) 
		    System.out.println("Entered Employee ID Not Found in the Records");
	    }

}
