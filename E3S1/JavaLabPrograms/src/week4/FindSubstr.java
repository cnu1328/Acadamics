package week4;

public class FindSubstr {

	public static void main(String[] args) {
		
        String mainString = "Hello, this is an example string.";
        String substring = "example";

        if (mainString.contains(substring)) {
            System.out.println("Substring '" + substring + "' found in the main string.");
            
            // Using substring method
            int startIndex = mainString.indexOf(substring);
	    System.out.println(startIndex);
            String extractedSubstring = mainString.substring(startIndex, startIndex + substring.length() + 1);
            System.out.println("Substring extracted using substring method: " + extractedSubstring);
            
            // Using startsWith and endsWith methods
            if (mainString.startsWith(substring)) {
                System.out.println("Main string starts with the substring.");
            }
            if (mainString.endsWith(substring)) {
                System.out.println("Main string ends with the substring.");
            }
        } else {
            System.out.println("Substring not found in the main string.");
        }
    }
	
}
