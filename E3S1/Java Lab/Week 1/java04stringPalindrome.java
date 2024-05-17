import java.util.Scanner;

public class java04stringPalindrome {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        int i = 0, j = a.length() - 1, flag = 1;
        while (i <= j) {
            if (a.charAt(i) != a.charAt(j)) {
                flag = 0;
                break;

            }
            ++i;
            --j;

        }
        if (flag == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
