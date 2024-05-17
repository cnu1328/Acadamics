import calculator.calci;
import java.util.*;
public class que4{
	public static void main(String[] args){
		calci c=new calci();
		Scanner sc=new Scanner(System.in);
		int k;
		System.out.println("enter two integers");
		double a,b;
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("enter 1.add 2.subtract 3.multiplication 4.division 5.modulo 6.square");
		k=sc.nextInt();
		c.display(k,a,b);
	}
}

