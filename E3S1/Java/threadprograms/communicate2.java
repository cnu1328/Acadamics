import java.io.*;
import java.lang.*;

class communicate2
{
       public static void main(String args[]) throws Exception
       {
           Producer1 obj1=new Producer1();
           Consumer1 obj2=new Consumer1(obj1);
 
           Thread t1=new Thread(obj1);
           Thread t2=new Thread(obj2);

                   t2.start();
                   t1.start();
     }
}


class Producer1 extends Thread
{
   StringBuffer sb;
  boolean dataprodover=false;

     Producer1()
     {
                sb=new StringBuffer();
     }
    public void run()
    {
      synchronized(sb)
       {
             
                   System.out.println("producer started producing data");
               for(int i=1;i<=10;i++)
              {
                        try
                          {
                             sb.append(i+":");
                               Thread.sleep(1000);
                               System.out.println("appending : "+ i);
                              }
                    catch(Exception e)
                     {}
              }
                   System.out.println("producer finihed with producing data");
                  sb.notify();

		  //this method releases the object, and sends a notification to a wating Thread, that object is avaialbe. 
               }
         }
}


class Consumer1 extends Thread
{
    Producer1 prod;
        Consumer1(Producer1 prod)
       {
                this.prod=prod;
       }
  public void run()
  {
         synchronized(prod.sb)
         { 
          try
           {
                  prod.sb.wait();
		 //This method makes a thred to wait for the object, till it recieves a notification from a notified method.
               
		
                 
         
          }    catch(Exception e)
                  {}
               System.out.println("Consumer now consuming"+prod.sb);
         } 
  }
}
    
       
