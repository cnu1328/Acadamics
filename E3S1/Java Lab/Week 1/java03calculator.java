import java.util.Scanner;

public class java03calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Oprations to be Performed:");
        int T = sc.nextInt();
        while (T!=0) {
            System.out.print("Enter a opertion:");
            char symbol = sc.next().charAt(0);
            // System.out.println(symbol);
            System.out.print("Enter Number1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number2: ");
            int num2 = sc.nextInt();
            switch (symbol) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            --T;
        }

    }
}
