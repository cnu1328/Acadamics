package constructors;

public class DefaultConstructor {
	
	String s;
	int id;
	
	public static void main(String args[]) {
		
		DefaultConstructor s1 = new DefaultConstructor();
		DefaultConstructor s2 = new DefaultConstructor();
		
		System.out.println(s1.id);
		System.out.println(s1.s);
		
		System.out.println(s2.id);
		System.out.println(s2.s);
		
	}
	
}
