package week2;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter number of elements : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print("Sorted Elements : ");
		
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}	
		

	}

}
