package week2;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	System.out.println("Enter the size of the aray : ");
	
		int n = sc.nextInt();
	
		int arr[] = new int[n];
	
		System.out.println("Enter aray Elements : ");
	
		for(int i=0; i<n; i++) {
		    int a = sc.nextInt();
		    arr[i] = a;
		}
		
		System.out.println("Enter a element you want to Search : ");
	
		int search = sc.nextInt();
		Arrays.sort(arr);
		
		boolean flag = binarySearch(arr, 0, n, search);
        boolean flag1 = binarySearchRecurse(arr, 0, n-1, search);

		if(flag)
		    System.out.println("Your Search Found");
		else
		    System.out.println("Your Search Not found");
	
		if(flag1)
		    System.out.println("Your Search Found");
		else
		    System.out.println("Your Search Not found");

	}
	
	public static boolean binarySearchRecurse(int arr[], int left, int right, int search) {
		int mid;

		if(left <= right) {
		    mid = (left + right)/2;

		    if(arr[mid] == search)
		    	return true;

		    else if(arr[mid] < search)
		    	return binarySearchRecurse(arr, mid + 1, right, search);
		    
		    return binarySearchRecurse(arr, left, mid - 1, search);
		}

		return false;
    }
	
	public static boolean binarySearch(int arr[], int left, int right, int search) {

		while(left < right) {
		    int mid = (left + right)/2;

		    if(arr[mid] == search)
		    	return true;
		    
		    else if(arr[mid] < search)
		    	left = mid + 1;
		    else
		    	right = mid - 1;
			
		}

		return false;
	}

}
