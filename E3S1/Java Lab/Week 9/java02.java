//Write a program that shows that the order of the catch blocks is important. If you try to catch a superclass
// exception type before a subclass type, the compiler should generate errors. 

public class java02 {
    public static void main(String[] args) {
        int a = 10, b = 0, sum;
        try {
            sum = a / b;
            System.out.println("sum =" + sum);
        } catch (Exception e) {
            System.out.println("Not a valid input");
        } catch (ArithmeticException e) {
            System.out.println("You can not divide something by 0");
        }

    }

}
