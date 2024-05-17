import java.io.*;
import java.lang.*;

class BookTicket extends Thread
{
   Object train,comp;
   
   BookTicket(Object train, Object comp)
   {
         this.train=train;
         this.comp=comp;
    }
public void run()
{
        synchronized(train)
        {
                System.out.println("Book ticket locked on train");
               
                 try{
                         Thread.sleep(3000);
                         }
                catch(Exception e)
                 {}
                 System.out.println("Book ticket now waiting to lock on compartment");
                   synchronized(comp)
                   {
                        System.out.println("book ticket locked on compartment");
                          try{
                         Thread.sleep(3000);
                         }
                catch(Exception e)
                 {}

System.out.println("finished with booking");
                    }
           }

}

}

class CancelTicket extends Thread
{
   Object train,comp;
   
   CancelTicket(Object train, Object comp)
   {
         this.train=train;
         this.comp=comp;
    }
public void run()
{
        synchronized(train)
        {
                System.out.println("cancel ticket locked on train");
               
                 try{
                         Thread.sleep(5000);
                         }
                catch(Exception e)
                 {}
                 System.out.println("cancel ticket now waiting to lock on compartment");
                   synchronized(train)
                   {
                        System.out.println("cancel ticket locked on compartment");
   try{
                         Thread.sleep(3000);
                         }
                catch(Exception e)
                 {}

System.out.println("finished with cancellation");
                    }
           }
}
}

class deadlock
{
      public static void main(String args[])
     {
               Object train=new Object();
               Object comp=new Object();
           
               BookTicket obj1=new BookTicket(train,comp);
               CancelTicket obj2=new CancelTicket(train,comp);
             
                Thread t1=new Thread(obj1);
                Thread   t2=new Thread(obj2);

                        t1.start();
                        t2.start();
    }
}
