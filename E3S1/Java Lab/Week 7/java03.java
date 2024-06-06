interface payable{
    float getAmount();
    }
    class employee_03 implements payable{ float Salary;
    float deductions=1500; employee_03(float salary){
    this.Salary=salary;
    }
    @Override
    public float getAmount() {
    return this.Salary-this.deductions;
    }
    float invoice(){
    return this.Salary;
    }
    }
    public class java03 {
    public static void main(String[] args) { employee_03 e1= new employee_03(15000); System.out.println("Salary: "+e1.Salary);
     
    System.out.println("Invoice: "+e1.invoice());
    }
    }
    