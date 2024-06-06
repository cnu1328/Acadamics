import java.util.Scanner;

// package Week 3; 
class Employee {
    String name;
    int age;
    char gender;
    String designtion;
    double salary;
    String address;

    Employee(String name, int age, char gender, String designation, double salary, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designtion = designation;
        this.salary = salary;

        this.address = address;

    }
    void display(){
        System.out.printf("%-12s : %s\n","Name",this.name);
        // System.out.printf("%-12s : %s\n","Id",this.Id);
        System.out.printf("%-12s : %d\n","Age",this.age);
        System.out.printf("%-12s : %s\n","Gender",this.gender);
        System.out.printf("%-12s : %s\n","Designation",this.designtion);
        System.out.printf("%-12s : %.2f\n","Salary",this.salary);
        System.out.printf("%-12s : %s\n","Address",this.address);
        }
       }
    

// }

public class java01employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Employees:");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        // int i=0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of employee " + (i+1) + ": ");
            String name = sc.next();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            String designation = sc.next();
            Double salary = sc.nextDouble();
            String address = sc.next();
            emp[i]=new Employee(name, age, gender, designation, salary, address);

        }
        System.out.println("Enter Search name");
      String searchname=sc.next();
      int K;

        for ( K = 0; K< n; K++) {
          
               if(searchname.equals(emp[K].name))
               {
               emp[K].display();
                break;
               }
        
        }

    }
}
