package Details;
public class MyDetails{
	public String name;
	public int age;
	public int id;
	public String Address;
	public MyDetails(String name,int age,int id,String Address){
		this.name=name;
		this.age=age;
		this.id=id;
		this.Address=Address;
	}
	public void display(){
		System.out.print("Your name="+name);
		System.out.print(",age="+age);
		System.out.print(",id="+id);
		System.out.print("and Address="+Address);}
}