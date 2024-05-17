import java.io.*;

class MyThread1 extends Thread 
{
   boolean stop=false;
  public void run() 
  {   System.out.println(" Thread started its execution");
        for(int i=1;i<=10;i++)
        {    try {
              Thread.sleep(1000);}
              catch(Exception e)
                               { System.out.println(e);}
              System.out.println(i);
              if(stop){
                            System.out.println("Thread execution terminated");
                   return;
                     }
         }
  }
}

class thread2 
{
     public static void main ( String args[]) throws IOException
    {
          MyThread1 obj=new MyThread1();
            Thread t=new Thread(obj);
                   t.start();
                   System.in.read();
                          obj.stop=true;
    }
}

