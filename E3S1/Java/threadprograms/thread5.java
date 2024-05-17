import java.io.*;
import java.lang.*;

class Reserve1 implements Runnable
{
           int available=1;
           int wanted;

           Reserve1(int i)
           {
               wanted=i;
            }
          public void run()
         {
                   synchronized(this) {
               System.out.println("Available berths ="+available);
               if(available >=wanted)
               {
                          String name=Thread.currentThread().getName();
                          System.out.println(wanted+" berths reserved for "+name);
                           try
                           {
                                Thread.sleep(1000);
                                 available=available-wanted;
                            }
                         catch(Exception e)
                        {}
                 }
                  else
                                  System.out.println(" sorry no berths reserved ");
               }
}
}

class thread5
{
      public static void main( String args[])
     {
            Reserve1 obj=new Reserve1(1);
             Thread t1=new Thread(obj);          
             Thread t2=new Thread(obj);

                     t1.setName("suresh");
                     t2.setName("Mahesh");

                      t1.start();
                      t2.start();
    }
}


    
