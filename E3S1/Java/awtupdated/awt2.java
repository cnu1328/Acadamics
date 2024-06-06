import java.awt.*;
import java.awt.event.*;
class awt2 {
 public static void main(String args[]) {
   Frame f=new Frame("My AWT frame");
     f.setSize(1000,850);
     f.setVisible(true);
//f.addWindowListener(WindowListener object);
     f.addWindowListener(new MyClass());    
   }
}

class MyClass implements WindowListener
{
     public void windowActivated(WindowEvent e){}
     public void windowClosed(WindowEvent e){}
     public void windowClosing(WindowEvent e){
                 System.exit(0);   
     }
     public void windowDeactivated(WindowEvent e){}
     public void windowDeiconified(WindowEvent e){}
     public void windowIconified(WindowEvent e){}
     public void windowOpened(WindowEvent e){}
}
     
    
   