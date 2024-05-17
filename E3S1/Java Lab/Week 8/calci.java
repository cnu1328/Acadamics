package calculator;
public class calci{
	public void display(int k,double a,double b){
		switch(k){
			case 1:
				System.out.println("addition of two intergers="+(a+b));
				break;
			case 2:
				System.out.println("subtraction of two intergers="+(a-b));
				break;	
			case 3:
				System.out.println("multiplication of two intergers="+(a*b));
				break;
			case 4:
				System.out.println("division of two intergers="+(a/b));
				break;
			case 5:
				System.out.println("modulo of two intergers="+(a%b));
				break;	
			case 6:
				System.out.println("square of two intergers="+(a*a)+","+(b*b));
				break;	
		}
	}
}
