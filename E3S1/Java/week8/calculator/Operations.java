
package calculator;

public class Operations implements Calculator {
    
    @Override
    public double addition(double num1, double num2) {
    	return num1 + num2;
    }
    
    
    
    @Override
    public double substraction(double num1, double num2) {
    	return num1 - num2;
    }
    
    @Override
    public double multiplication(double num1, double num2) {
    	return num1*num2;
    }
    
    @Override
    public double division(double num1, double num2) {
    	if(num2 != 0)
    		return num1/num2;
    		
    	throw new ArithmeticException("Cannot divide by zero");
    }
}
