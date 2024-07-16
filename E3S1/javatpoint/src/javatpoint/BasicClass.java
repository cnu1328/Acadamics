package javatpoint;

public class BasicClass {
	
	int id;
	String name;
	
	
	/*
	 * What is a class in Java
	 * 
		A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
		
		A class in Java can contain:
		
		Fields
		Methods
		Constructors
		Blocks
		Nested class and interface
	 * 
	 * 
	 */
	
	//An object is an instance of a class.
	
	/*
	 * Object Definitions:

		An object is a real-world entity.
		An object is a runtime entity.
		The object is an entity which has state, behavior and identity.
		The object is an instance of a class.
	 */

	public static void main(String[] args) {
		 
		BasicClass stu = new BasicClass();
		
		System.out.println(stu.id);
		System.out.println(stu.name);
	}

}
