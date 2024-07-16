package week4;

import java.util.Collections;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to revese it : ");
		String str = sc.nextLine();
		
		int  i = 0, j = str.length() - 1;
		
		while(i <= j) {
			StringBuilder sb = new StringBuilder(str);
			sb.setCharAt(i, str.charAt(j));
			sb.setCharAt(j, str.charAt(i));
			
			str = sb.toString();
			i++; j--;
			
		}
		
		System.out.println("Reversed String is : " + str);

	}

	

}
