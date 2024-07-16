package week1;

import java.util.Scanner;
import java.util.Arrays;

public class SmallestBiggest {

	public static void main(String[] args) {
		
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
		    arr[i] = sc.nextInt();
		    
		}
		
		System.out.println("Entered Array Values : ");
		
		for(int i=0; i<5; i++) 
		    System.out.print(arr[i] + " ");
		
		Arrays.sort(arr);
		System.out.println();
		System.out.println("The largest Number is : " + arr[4] + "\n" + "smallest Number is : " + arr[0]); 
		
	}
}
