import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class java05vowelandconso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int v = 0, c = 0;
        System.out.println("The Vowels are:");
        int i = 0;
        while (i < a.length()) {

            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'|| a.charAt(i)=='u' )
            {
                System.out.print(a.charAt(i)+" ");
                ++v;
            }
            else{
                ++c;

            }
            ++i;
        }
        System.out.println();
        System.out.println("Vowels Count="+v);
        System.out.println("Consonant Count="+c);

    }
}
