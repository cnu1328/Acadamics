package week4;

public class ChangeCase {

	public static void main(String[] args) {
		String str = "This is a Sample String";

        // Convert to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert back to lowercase
        String lowerCase = upperCase.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
	}

}
