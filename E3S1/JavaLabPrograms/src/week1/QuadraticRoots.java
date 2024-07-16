package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticRoots {

	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		System.out.println("Enter values of a, b and c : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		int discriminant = b*b - 4*a*c;
		
		if(discriminant == 0) {
			System.out.println("The Real Roots are " + -b/2*a + " and " + -b/2*a);
		}
		
		else if(discriminant > 0) {
			double square = Math.sqrt(discriminant);
			
			double r1 = (double)(-b + square)/(2*a);
			double r2 = (double)(-b - square)/(2*a);
			
			System.out.println("The real and distinct roots are " + decfor.format(r1) + " and " + decfor.format(r2));
			
		} else {
			System.out.println("The root so fthe equation are complex and Imaginary. \n");
			
			double r1 = -(double)b/2*a;
			double r2 = -(double)b/2*a;
			
			double sqrt = Math.sqrt(Math.abs(discriminant));
			
			System.out.println(decfor.format(r1) + " + i" + decfor.format(sqrt) + " and " + decfor.format(r2) + " - " + decfor.format(sqrt));
		}
		
		
	}

}
