import org.shapes.Circle;
import org.shapes.Square;
import org.shapes.Triangle;
import java.util.*;
public class que2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter circle radius:");
		double r1=sc.nextDouble();
		Circle c1=new Circle();
		c1.getArea(r1);
		c1.getPerimeter(r1);
		System.out.println("enter square side:");
		double s=sc.nextDouble();
		Square s1=new Square();
		s1.getArea(s);
		s1.getPerimeter(s);
		System.out.println("enter triangle three sides a b c and its height:");
		double a=sc.nextDouble();		
		double b=sc.nextDouble();		
		double c=sc.nextDouble();		
		double h=sc.nextDouble();		
		Triangle t=new Triangle();
		t.getArea(b,h);
		t.getPerimeter(a,b,c);
	}
}