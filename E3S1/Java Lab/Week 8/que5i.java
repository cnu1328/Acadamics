import interfaces.inter1;
import java.util.*;
public class que5i{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two integers:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		inter1 i1=new inter1();
		i1.sum(a,b);
		i1.avg(a,b);
	}
}
