package week1;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n  = sc.nextInt();
		
		System.out.print("Prime fractors of given number is/are : ");
		
		for(int i=2; i<n; i++) {
			
			if(n%i == 0) {
				
				boolean flag = true;
				
				
				
				for(int j=2; j*j<=n; j++) {
					if(i%j == 0) {
						flag = false;
					}
				}
				
				if(flag || i == 2) {
					System.out.print(i + " ");
				}
			}
			
			
		}

	}

}
