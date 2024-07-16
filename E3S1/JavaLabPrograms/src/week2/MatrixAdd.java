package week2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	System.out.println("Enter row or a col of the 2D array : ");
    	int n = sc.nextInt();
    	
    	int arr[][] = new int[n][n];
    	int array[][] = new int[n][n];
    	
    	System.out.println("Enter 1st array Elements : ");
    	insert(arr, n);
    	
    	System.out.println("Enter 2nd array Elements : ");
    	insert(array, n);
    	
    	System.out.println("Entered 1st Array : ");
    	print(arr, n);
    	

    	System.out.println("Entered 2nd Array : ");
    	print(array, n);
    	
    	System.out.println("Summation Array of two Arrays is : ");
    	
    	int result[][] = new int[n][n];
    	addition(result,arr, array, n);
    	print(result, n);

	}
	
	 private static void insert(int arr1[][], int n) {
		 
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<n; i++) {
		    for(int j=0; j<n; j++) {
		    	arr1[i][j] = sc.nextInt();
		    }
		    
		}
	 }
	 
	 private static void print(int arr1[][], int n) {
		for(int i=0; i<n; i++) {
		    for(int j=0; j<n; j++) {
		    	System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}
	 }
	 
	 public static void addition(int result[][], int arr[][], int array[][], int n) {
		for(int i=0; i<n; i++) {
		   for(int j=0; j<n; j++) {
			   result[i][j] = arr[i][j] + array[i][j];
		   }
		}
	 }

}
