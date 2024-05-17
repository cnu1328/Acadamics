import java.util.Scanner;

public class java01compareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b=sc.next();
         int x=a.compareTo(b);
         if(x>0)
        System.out.println("a is Greater");
        else if(x==0)
        System.out.println("both string are equals");
        else
        System.out.println("a is Greater");
    }

}
