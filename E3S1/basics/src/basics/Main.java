package basics;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		System.out.println("Hello Word!");
//		System.out.println("Hello Java!");

		//Variables and DataTypes
		
		int num = 10;
		double num1 = 5.0;
		boolean bll = false;
		char ch = 'a';
		String str = "Srinu";
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(bll);
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println("Basic Operations");
		
		//Basic Operations
		int x = 5;
		int y = 7;
		int z = 56;
		int sum = x + y + z;
		int sub = x - y - z;
		int mul = x * y * z;
		double div = x/(double)y; //Type casting
		int rem = x % y;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		
		//Input and Scanners
		
//		Scanner sc = new Scanner(System.in);
//		String scanned = sc.next();
//		
//		System.out.println(scanned);
		
//		Scanner sc = new Scanner(System.in);
//		int scanned = sc.nextInt();
//		
//		System.out.println(scanned);
		
//		Scanner sc = new Scanner(System.in);
//		double scanned = sc.nextDouble();
//		
//		System.out.println(scanned);
		
//		Scanner sc = new Scanner(System.in);
//		boolean scanned = sc.nextBoolean();
//		
//		System.out.println(scanned);
		
//		Scanner sc = new Scanner(System.in);
//		String scanned = sc.next();
//		
//		x = Integer.parseInt(scanned);
//		
//		System.out.println(x);
		
		//Conditions and Booleans
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		boolean compare = !(a>b) && b < c;
		
		System.out.println(compare);
		
		//If/ Else/ Else If
//		System.out.println("Enter a string : ");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		
//		if(s.equals("Hello")) {
//			System.out.println("You Entered Hello");
//		}
//		
//		else if(s.equals("hi")) {
//			System.out.println("You Entered Hii");
//		}
//		
//		else {
//			System.out.println("You Entered other than hi and Hello");
//		}
		
		//Nested Statements

		System.out.print("Enter Your age : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		
		if(age >= 18) {
			System.out.println("You are adult");
			
			System.out.print("Enter your Favorite Food : ");
			String food = sc.nextLine();
			
			if(food.equals("pizza")) {
				System.out.println("You can eat Pizza");
			}
			
			else {
				System.out.println("You are not allowed to eat Your Favorite food");
			}
		}
		
		else if(age >= 13) {
			System.out.println("You are teenager");
			
		}
		
		else {
			System.out.println("You are not both of therm");
		}
		
	}

}
