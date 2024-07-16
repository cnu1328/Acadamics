package week2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	System.out.print("Enter the size of the aray : ");

		int n = sc.nextInt();
	
		int arr[] = new int[n];
	
		System.out.print("Enter aray Elements : ");
	
		for(int i=0; i<n; i++) {
		    int a = sc.nextInt();
		    arr[i] = a;
		}
		
		System.out.println("Enter a element you want to Search : ");
	
		int search = sc.nextInt();

		boolean flag = search(arr, n, search);

		if(flag) 
		   System.out.println("The element is found");
		
		else
		    System.out.println("The Element is not found");
		
	}
	
	static boolean search(int arr[], int n, int search) {
		
		for(int i=0; i<n; i++) {
		     if(arr[i] == search) {
		    	 return true;
		     }
		}
		
		return false;
	}

}
