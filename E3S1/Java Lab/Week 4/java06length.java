import java.util.*;

public class java06length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = 0;
        char[] ch = a.toCharArray();
        for (char x : ch)
            ++i;

        System.out.println(i);
    }
}
