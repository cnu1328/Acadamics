package strings;

public class Strings {
	
	//In Java, string is basically an object that represents sequence of char values.
	//An array of characters works same as Java string. 
	
	//Java String class provides a lot of methods to perform operations on strings such as
	//compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

	//The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
	
	//The CharSequence interface is used to represent the sequence of characters.
	//String, StringBuffer and StringBuilder classes implement it. It means,
	//we can create strings in Java by using these three classes.
	
	//The Java String is immutable which means it cannot be changed. 
	//Whenever we change any string, a new instance is created. 
	//For mutable strings, you can use StringBuffer and StringBuilder classes.
	
	
	//What is string in java?
	
	//Generally, String is a sequence of characters. But in Java, string is an object that represents 
	//a sequence of characters. The java.lang.String class is used to create a string object.
	
	//There are two ways to create String object:

		//By string literal
		//By new keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch); 
		
		System.out.println(s);
		
		//String literal 
		String name = "Srinivas";
		System.out.println(name);
		
		//Each time you create a string literal, the JVM checks the "string constant pool" first. 
		//If the string already exists in the pool, a reference to the pooled instance is returned.
		//If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
		
		String s1 = "Welcome";
		String s2 = "Welcome"; //It doesn't create a new instance
		
		System.out.println(s1 + " " + s2);
		
//		Note: String objects are stored in a special memory area known as the "string constant pool".
		
//		Why Java uses the concept of String literal? To make java More Memory Efficient
		
		
		
		//By New Keyword
		
		String s3 = new String("Welcome");//creates two objects and one reference variable  
		System.out.println(s3);
		
		
//		In such case, JVM will create a new string object in normal (non-pool) heap memory,
//		and the literal "Welcome" will be placed in the string constant pool.
//		The variable s3 will refer to the object in a heap (non-pool).
		
	
		//Java String class methods
		
		System.out.println("\nJava String Class Methods\n");
		
		String str = "Srinivas";
		String str2 = new String("Dharpally");
		
		System.out.println(str.charAt(0)); 
		//It returns char value for the particular index
		
		System.out.println(str.length());
		//It returns string length
		
		String fmt = String.format("%s", str);
		fmt = String.format("%s", str2);
		
		System.out.println(fmt);
		
		System.out.println(str.substring(2));
		//It returns substring for given begin index.
		
		System.out.println(str.substring(0, 3));
		//It returns substring for given begin index and end index.
		
		
		System.out.println(str.contains(str2));
		//It returns true or false after matching the sequence of char value.
		
		System.out.println(str.contains("Sri"));
		
		System.out.println(String.join(" ", str, str2));
		//It returns a joined string.
		System.out.println(String.join(" ", str2, str));
		
	
	}

}
