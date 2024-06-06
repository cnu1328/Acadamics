import javax.xml.transform.Source;
import java.util.Scanner;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class java04Palindrome {
    public static int isPalindrome(int n) {

        int temp=n,sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        if(temp==sum)
        return 1;
        return 0;

    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner scanning= new Scanner(System.in);
        int num = scanning.nextInt();
        if (isPalindrome(num) == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
