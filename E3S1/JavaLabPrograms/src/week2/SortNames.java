package week2;

import java.util.Scanner;
import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	System.out.println("Enter the size of the aray : ");

		int n = sc.nextInt();
	
		String arr[] = new String[n];
	
		System.out.println("Enter Names : ");
	
		for(int i=0; i<n; i++) {
		     arr[i] = sc.next();
		    
		}
		
		Arrays.sort(arr);
		System.out.print("Sorted Elements with Built in functios are : \n");	
	
		for(int i=0; i<n; i++) {
		    System.out.print(arr[i] + ", ");
		}	
		
		System.out.println();

	}

}
