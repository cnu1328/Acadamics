import java.util.*;
public class java03indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        int i = 0, c = 0;
        System.out.println(a.indexOf(b));
        while (i<a.length()) {
            if (a.charAt(i) == b)
                ++c;
            ++i;

        }
        System.out.println(c);
    }
}
