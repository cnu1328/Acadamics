package week3;

import java.util.Scanner;

public class InputFive {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int index = 0;
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number between 10 and 100 inclusive.");
			int num = sc.nextInt();
			
			if(num >= 10 && num<=100 && !isPresent(arr, num)) {
				arr[index++] = num;
				print(arr, index);
			}
			
			else if(num < 10 || num > 100) {
				System.out.println("Entered number greater than 100 or less than 10 please check.\n");
			}
			
			else {
				System.out.println("Entered Number already Exist in the Entered Bag!!!\n");
			}
			
			if(index == 5) {
				System.out.println("You have Entered All the Five values. Kudos to you!!!\n");
				break;
			}
		}
		

	}
	
	static void print(int arr[], int index) {
		System.out.println("\nEntered Values : ");
		for(int i=0; i<index; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	static boolean isPresent(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) return true;
		}
		
		return false;
	}

}
