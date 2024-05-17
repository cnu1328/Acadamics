import org.w3c.dom.traversal.NodeFilter;

// Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee with information 
// number of hours & wages per hour, number of weeks & wages per week respectively & method 
// calculateWages() to calculate their monthly salary. Also override getDesig () method depending on the type 
// of contract employee
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
class HourlyEmployee extends ContractEmp
{
    int noofHours;
    double wages;
    HourlyEmployee(String Firstname, String Lastname, String department, String designation,int noofHours,double wages) {
        super(Firstname, Lastname,department,designation);
        this.noofHours=noofHours;
        this.wages=wages;

    
    }
    void getSalary()
    {
        System.out.println("The Salary of Hourly Contract Employee is: "+(noofHours*wages));
    }
    void getDesig() {
        System.out.println("The Designation of Hourly Contract Employee is :" + this.designation);
    }
}
class WeeklyEmployee extends ContractEmp
{
    int noofweeks;
    double wages;
    WeeklyEmployee(String Firstname, String Lastname, String department, String designation,int noofweeks,double wages) {
        super(Firstname, Lastname,department,designation);
        this.noofweeks=noofweeks;
        this.wages=wages;

    
    }
    void getSalary()
    {
        System.out.println("The Salary of Weekly Contract Employee is: "+(noofweeks*wages));
    }
    void getDesig() {
        System.out.println("The Designation of Weekly Contract Employee is :" + this.designation);
    }
}
public class java04 {
    public static void main(String[] args) {
        WeeklyEmployee e1=new WeeklyEmployee("Surya", "Prakash", "CSE", "hod", 11, 10000);
    // e1.getSalary();
        
    }
}
