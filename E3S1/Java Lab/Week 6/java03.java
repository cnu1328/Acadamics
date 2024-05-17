import java.nio.channels.ScatteringByteChannel;

import javax.sound.midi.Soundbank;

// Write an application to create a super class Employee with information first name & last name and methods 
// getFirstName(), getLastName() derive the sub-classes ContractEmployee and RegularEmployee with the 
// information about department, designation & method displayFullName() , getDepartment(), getDesig() to print 
// the salary and to set department name & designation of the corresponding sub-class objects respectively. 
class Employee {
    String Firstname;
    String Lastname;

    void getFirstName() {
        System.out.println("The First name is: " + this.Firstname);
    }

    void getLasttName() {
        System.out.println("The First name is: " + this.Lastname);
    }

    Employee(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }
}

class ContractEmp extends Employee {
    String department;
    String designation;

    void displayFullName() {
        System.out.println("The Full name is: " + Firstname + " " + Lastname);

    }

    ContractEmp(String Firstname, String Lastname, String department, String designation) {
        super(Firstname, Lastname);
        this.department = department;
        this.designation = designation;
    }

    void getDepartment() {
        System.out.println("The Department of Contract Employee is :" + this.department);
    }

    void getDesig() {
        System.out.println("The Designation of Contract Employee is :" + this.designation);
    }

    void SetDepartment(String department) {

        this.department = department;
    }

    void setDesig(String designation) {

        this.designation = designation;
    }

}
class RegularEmp extends Employee {
    String department;
    String designation;

    void displayFullName() {
        System.out.println("The Full name is: " + Firstname + " " + Lastname);

    }

    RegularEmp(String Firstname, String Lastname, String department, String designation) {
        super(Firstname, Lastname);
        this.department = department;
        this.designation = designation;
    }

    void getDepartment() {
        System.out.println("The Department of Contract Employee is :" + this.department);
    }

    void getDesig() {
        System.out.println("The Designation of Contract Employee is :" + this.designation);
    }

    void SetDepartment(String department) {

        this.department = department;
    }

    void setDesig(String designation) {

        this.designation = designation;
    }

}

public class java03 {
    public static void main(String[] args) {

    }

}
