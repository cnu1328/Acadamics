package week4;
import java.util.*;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	String s1 = "Good";
    	String s2 = "Goods";
    	
    	if(s1.compareTo(s2) > 0) {
    	    System.out.println("S1 is greater than S2");
    	}

    	else if(s1.compareTo(s2) < 0) {
    	    System.out.println("S1 is Smaller than S2");
    	}

    	else {
    	    System.out.println("Both strings are equal");
    	}
    	

	}

}
