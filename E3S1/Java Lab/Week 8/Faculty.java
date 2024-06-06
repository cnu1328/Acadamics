package RGUKT;
public class Faculty{
	public String name;
	public int id;
	public String Subject;
	public Faculty(String name,int id,String Sub){
		this.name=name;
		this.id=id;
		this.Subject=Sub;
	}
	public void display(){
		System.out.println("faculty name is "+name+",id="+id+",teaching subject="+Subject);
	}
}