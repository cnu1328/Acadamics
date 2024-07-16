package week4;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to count Number of vowels : ");
		String str = sc.nextLine();
		
		int vcnt  = 0;
		int ocnt = 0;
		
		System.out.print("Vowel Characters in the string are  : ");
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i)== 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i)== 'u' || str.charAt(i) == 'U') {
				System.out.print(str.charAt(i) + ", ");
				vcnt++;
	       	}
		    else
		    	ocnt++;
		
		}
		
		System.out.println();
		System.out.println("Number of Occurance of vowels are : " + vcnt);
		System.out.println("Number of Occurance of Consonants are : " + ocnt);

	}

}
