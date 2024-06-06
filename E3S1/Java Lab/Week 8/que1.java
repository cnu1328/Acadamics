import RGUKT.Faculty;
import RGUKT.Student;
import java.util.*;
public class que1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Faculty name,id,subject");
		String name=sc.next();
		int id=sc.nextInt();
		String Subject=sc.next();
		Faculty f1=new Faculty(name,id,Subject);
		System.out.println("enter student name,age,id,address");
		String n1=sc.next();
		int age=sc.nextInt();
		int id1=sc.nextInt();
		String Address=sc.next();
		Student s1=new Student(n1,age,id1,Address);
		f1.display();
		s1.display();
	}
}
		