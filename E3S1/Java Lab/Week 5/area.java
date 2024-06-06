import java.util.Scanner; 
class area
{ 
double r; 
double Area() 
{ 
return (22/7)*r*r; 
} 
double Perimeter() 
{ 
return 2*(22/7)*r; 
} 
} 
//class declares multiple objects of circle 
class Demo 
{ 
public static void main(String args[]) 
{ 
Scanner s=new Scanner(System.in); 
Week5 c=new Week5();//object1 
System.out.println("Enter the radius of circle"); 
double R=s.nextDouble(); 
c.r=R; 
System.out.println("Perimeter of circle is:"+c.Perimeter()); 
System.out.println("Area of circle is:"+c.Area()); 
} 
}