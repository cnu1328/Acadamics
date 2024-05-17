
import java.util.Scanner;

public class java07stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); 
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}
