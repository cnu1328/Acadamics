import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class java03primefactors {

    public static int isPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                ++count;
            }

        }
        if (count == 2)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isPrime(i) == 1) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
