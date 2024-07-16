package week1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int num = sc.nextInt();
		
		int a = num, sum = 0;
		
		while(a > 0) {
			int rem = a%10;
			sum = sum*10 + rem;
			a /= 10;
		}
		
		if(num == sum)  
			System.out.println("Entered Number is Palindrome");
		else 
			System.out.println("Entered Number is not a plindrome");
		
	}

}
