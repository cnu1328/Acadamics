package week4;

import java.util.Scanner;

public class CountAlpha {

	public static void main(String[] args) {
		String text = "This is a Example string to count the number of an Alphabet";

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character to Count the number of Occurences : ");

		char ch = sc.nextLine().charAt(0);
		
		char alphabet = Character.toLowerCase(ch);
		
		int count = 0;
		
		int index = text.indexOf(alphabet);
		
		while(index != -1) {
			count++;
			
			index = text.indexOf(alphabet, index+1);
		}
		
		System.out.println("Number of characters of given alphabet ("+alphabet+") is : " + count);
	}

}
