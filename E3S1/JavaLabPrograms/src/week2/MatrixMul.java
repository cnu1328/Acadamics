package week2;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixMul {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int r1,c1,r2,c2;

		System.out.println("Enter row and column of 1st array : ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		
		int arr[][] = new int[r1][c1];
		
		System.out.println("Enter 1st array Elements : ");
		insert(arr, r1, c1);
		
		System.out.println("Enter row and column of 2nd array : ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();

		int array[][] = new int[r2][c2];
		System.out.println("Enter 2nd array Elements : ");
		insert(array, r2, c2);
		
		System.out.println("Entered 1st Array : ");
		print(arr, r1, c1);
		

		System.out.println("Entered 2nd Array : ");
		print(array, r2, c2);

		System.out.println("Multiplication Array of two Arrays is : ");
		int result[][] = new int[r1][c2];
		multiply(result,arr, array, r1, c1, r2, c2);
		print(result, r1, c2);
		
	}
	
	private static void insert(int arr1[][], int row, int col) {
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		    	
		    	arr1[i][j] =  sc.nextInt();
		    }
		    
		}
	}
	
	private static void print(int arr1[][], int row, int col) {
		
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		    	System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static void multiply(int result[][], int arr[][], int array[][], int r1, int c1,int r2, int c2) {
		if(c1 == r2) {
			for(int i=0; i<r1; i++) {
			   for(int j=0; j<c2; j++) {
				   for(int k = 0; k<c1; k++) {
					   result[i][j] += arr[i][k]*array[k][j];
				   }
			   	}
			}
		} else {
			System.out.println("Matrix Multiplication is not possible");
		}
		
	}

}
