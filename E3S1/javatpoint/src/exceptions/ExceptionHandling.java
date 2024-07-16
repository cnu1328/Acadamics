package exceptions;

public class ExceptionHandling {
	
	//The Exception Handling in Java is one of the powerful mechanism to handle
	//the runtime errors so that the normal flow of the application
	//can be maintained
	
//	What is Exception in Java?
	
	//In Java, an exception is an event that disrupts the normal flow of the 
	//program. It is an object which is thrown at runtime.
	
	
//	What is Exception Handling?
	
	//Exception Handling is a mechanism to handle runtime errors such as
	//ClassNotFoundException, IOException, SQLException, RemoteException, etc.

//	Advantage of Exception Handling - to maintain the normal flow of the application
	
	
//	Types of Java Exceptions
	
	// Checked Exception
		//The classes that directly inherit the Throwable class except RuntimeException
		//and Error are known as checked exceptions. For example, IOException, SQLException,
		//etc. Checked exceptions are checked at compile-time.
	
	// Uncheked Exception
		//The classes that inherit the RuntimeException are known as unchecked exceptions.
		//For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
		//Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
	
	// Error
	    //Error is irrecoverable. Some example of errors are OutOfMemoryError,
		//VirtualMachineError, AssertionError etc.
	
//	Java Exception KeyWords
	
	//try - The "try" keyword is used to specify a block where we should place an exception code.
			//It means we can't use try block alone. The try block must be followed by either catch or finally.
	
	//catch - The "catch" block is used to handle the exception. It must be preceded by try block which means
				//we can't use catch block alone. It can be followed by finally block later.
	
	//finally - The "finally" block is used to execute the necessary code of the program. 
			//It is executed whether an exception is handled or not.
	
	//throw - The "throw" keyword is used to throw an exception.
	
	//throws - The "throws" keyword is used to declare exceptions.
	
	public static void main(String[] args) {
		
		//Common Scenarios of Java Exceptions
		
		try {
			int data = 100/0; // A scenario where ArithmeticException occurs
			
			String s = null;
			
			System.out.println(s.length()); // A scenario where NullPointerException occurs
			
			String s1 = "abc";
			int i = Integer.parseInt(s1); //A scenario where NumberFormatException occurs
			
			int a[] = new int[5];
			
			a[10] = 50; // A scenario where ArrayIndexOutOfBoundsException occurs
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of the code...");
		
	}

}
