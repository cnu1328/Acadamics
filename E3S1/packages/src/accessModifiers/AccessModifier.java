package accessModifiers;

import packages.*;

class Example {
	
//	Role of Private Constructor
//	If you make any class constructor private, you cannot create the instance of that class from outside the class.
	
	/*private*/ Example() {}
//	Note: A class cannot be private or protected except nested class.

	
	private int data = 40;
	private void msg() {
		System.out.println("This is a message from Example Class" + data);
	}
}

public class AccessModifier extends Example1 {
	
//	There are two types of access modifiers in Java: 
//	1. access modifiers and 
//	2. non-access modifiers.
	
//	The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
//	We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

//	There are four types of Java access modifiers:
	
//	Private: The access level of a private modifier is only within the class.
//	It cannot be accessed from outside the class.
//	
//	Default: The access level of a default modifier is only within the package.
//	It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
//	
//	Protected: The access level of a protected modifier is within the package and outside 
//	the package through child class. If you do not make the child class(through inheritance only), 
//	it cannot be accessed from outside the package.
	
//	The protected access modifier can be applied on the data member, method and constructor.
//	It can't be applied on the class.
//	
//	Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
//	outside the class, within the package and outside the package.
	
//	There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient etc.,
	
	
	protected /* Other wise Compile Time Error */ void msg() {
		System.out.println("Hello Srinivas");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Example ex = new Example();
		
//		System.out.println("Data member : " + ex.data);
//		ex.msg(); //Error data is not visible, because of private field
		
//		Example1 ex1 = new Example1();
//		ex1.msg();  //The method msg() from the type Example1 is not visible
		
		AccessModifier ex2 = new AccessModifier();
		ex2.msg();
		
//		The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
		
		
//		Java Access Modifiers with Method Overriding
//		If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
		

	}

}
