
//package doarthematic;
import calculator.Operations;

public class DoArthmatic {

    public static void main(String[] args) {
    	double num1 = 10;
    	double num2 = 20;
    	
    	Operations op = new Operations();
    	
    	System.out.println("Addition of two Numbers " +  op.addition(num1, num2));
    	System.out.println("Substraction of two Numbers " +  op.substraction(num1, num2));
    	System.out.println("Multiplication of two Numbers " +  op.multiplication(num1, num2));
    	System.out.println("Division of two Numbers " +  op.division(num1, num2));
    	
    }
}
