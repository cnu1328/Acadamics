
public class Wrapperclass {

	public static void main(String[] args) {
		int a = 10;
		
		Integer d = a;// The automatic conversion of primitive into an object is known as autoboxing
		
		
		Integer b = Integer.valueOf(a);
		
		int c = d; //The automatic conversion of object into a primitive is known as unboxing
		
//		int c = b.intValue();
		
		System.out.println(a + " " + b + " " + c + " " + d);
    
	}

}
