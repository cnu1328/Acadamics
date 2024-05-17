import java.io.*;

class MyThread extends Thread 
{
  public void run() 
  {   System.out.println(" Thread started its execution");
        for(int i=1;i<=10;i++)
        {    try {
              Thread.sleep(1000);}
              catch(Exception e)
                               { System.out.println(e);}
              System.out.println(i);
         }
  }
}

class thread1
{
     public static void main ( String args[])
    {
          MyThread obj=new MyThread();
            Thread t=new Thread(obj);
                   t.start();
    }
}

