package week4;

public class Equal {

	public static void main(String[] args) {
		String s1 = "Good";
		String s2 = "good";
		
		if(s1.equals(s2)) {
			System.out.println("Both strings are equal");
		}
		
		else if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both strings are equal");
		}
		
		else  {
			System.out.println("Both strings are not equal");
		}
		
		

	}

}
