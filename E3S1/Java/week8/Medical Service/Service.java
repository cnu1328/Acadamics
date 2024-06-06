import mSeva.MSeva;
import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        MSeva ms = new MSeva();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nWelcome to M-Seva");
        System.out.println("Enter your Disease Symptoms (comma-seperated) : ");
        
        String userInput = sc.nextLine();
        String[] userSymptoms = userInput.split(",\\s*");
        
        String result = ms.identifyDisease(userSymptoms);
        System.out.println(result);
        System.out.println();
    }
}
