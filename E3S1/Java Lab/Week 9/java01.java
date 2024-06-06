import java.net.Socket;
import java.util.Scanner;

// Program for demonstrating the use of throw, throws & finally - Create a class with a main( ) that throws an 
// object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the 
// exception inside a catch clause and print the String argument. Add a finally clause and print a message to 
// prove you were there.
class Myexception extends Exception
{
    public Myexception(String message)
    {
        super(message);
    }
}
public  class java01{
    public static void division(int a,int b) throws Myexception{
        if(b==0)
        {
            throw (new Myexception("b should not be equal to 0, arithmetic expection"));
          
        }
        else
        {
            System.out.println("ANSWER="+(a/b));
        }
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
      try {
        division(a, b);
        
      } 
    catch(Myexception ex)
    {
        System.out.println("Myexception Caught");
        ex.printStackTrace();
    }
    finally{
    System.out.println("Program Completed");
    }
      

    }
}
