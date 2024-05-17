import java.awt.*;
import java.awt.event.*;
class awt3 {
 public static void main(String args[]) {
   Frame f=new Frame("My AWT frame");
     f.setSize(1000,850);
     f.setVisible(true);
//f.addWindowListener(WindowListener object);
     f.addWindowListener(new MyClass());    
   }
}

class MyClass extends WindowAdapter
{
     
     public void windowClosing(WindowEvent e){
                 System.exit(0);   
     }
   
}
     
    
   