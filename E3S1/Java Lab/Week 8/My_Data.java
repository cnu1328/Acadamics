import Details.MyDetails;
import java.util.*;
class My_Data{
	public static void main(String args[]){
		String name;
		int age;
		int id;
		String Address;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name,age,id,address");
		name=sc.next();
		age=sc.nextInt();
		id=sc.nextInt();
		Address=sc.next();
		MyDetails m1=new MyDetails(name,age,id,Address);
		m1.display();
	}
}