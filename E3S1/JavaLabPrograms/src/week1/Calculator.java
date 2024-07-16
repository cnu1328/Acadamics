package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
	
	private static final DecimalFormat decfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x and y values : ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("Choose your Operation (+, -, *, /) : ");
		String ch = sc.next();
		switch(ch) {
			case "+":
				System.out.print("Sum of two number is : ");
				System.out.println(x+y);
				break;
				
			case "-":
				System.out.print("Substraction of two number is : ");
				System.out.println(x-y);
				break;
				
			case "*":
				System.out.print("Multiplication of two number is : ");
				System.out.println(x*y);
				break;
				
			case "/":
				System.out.print("Division of two number is : ");
				System.out.println(decfor.format((double)x/y));
				break;
				
			default:
				System.out.println("Invalid Input");
				
				
		}
		
	}

}
