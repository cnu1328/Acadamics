class Employee1 {
    String firstName;
    String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee1 {
    String department;
    String designation;
    double salary;

    ContractEmployee(String firstName, String lastName, String department, String designation, double salary) {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    String displayFullName() {
        return getFirstName() + " " + getLastName();
    }

    String getDepartment() {
        return department;
    }

    String getDesignation() {
        return designation;
    }

    double getSalary() {
        return salary;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }
}

class RegularEmployee extends Employee {
    String department;
    String designation;
    double salary;

    RegularEmployee(String firstName, String lastName, String department, String designation, double salary) {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    String displayFullName() {
        return getFirstName() + " " + getLastName();
    }

    String getDepartment() {
        return department;
    }

    String getDesignation() {
        return designation;
    }

    double getSalary() {
        return salary;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }
}

public class Employee {
    public static void main(String[] args) {
        ContractEmployee cEmployee = new ContractEmployee("John", "Doe", "IT", "Consultant", 5000);
        RegularEmployee rEmployee = new RegularEmployee("Alice", "Smith", "HR", "Manager", 8000);

        // Accessing contract employee details
        System.out.println("Contract Employee Details:");
        System.out.println("Full Name: " + cEmployee.displayFullName());
        System.out.println("Department: " + cEmployee.getDepartment());
        System.out.println("Designation: " + cEmployee.getDesignation());
        System.out.println("Salary: $" + cEmployee.getSalary());

        // Accessing regular employee details
        System.out.println("\nRegular Employee Details:");
        System.out.println("Full Name: " + rEmployee.displayFullName());
        System.out.println("Department: " + rEmployee.getDepartment());
        System.out.println("Designation: " + rEmployee.getDesignation());
        System.out.println("Salary: $" + rEmployee.getSalary());
    }
}
