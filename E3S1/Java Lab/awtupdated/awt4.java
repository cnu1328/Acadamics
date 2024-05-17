import java.awt.*;
import java.awt.event.*;
class awt4 extends Frame {

      awt4() {
                this.addWindowListener(new WindowAdapter() 
                {
                       public void windowClosing(WindowEvent e)
                        {
                              System.exit(0);
                         }
                });
     }

//paint() of Component class. automatically called when a frame is created and displayed, paint() method of component class
//It works as follows: When you realize a user interface (call setVisible(true) in your case), Swing starts the EDT. 
//This EDT thread then runs in the background and, whenever your component needs to be painted,
// it calls the paint method with an appropriate Graphics instance for you to use for painting.

     public void paint(Graphics g) {
 
     //set blue color for drawing 
         g.setColor(Color.blue);
     // display a rectangle to contain in drawing
         g.drawRect(40,40,200,200);
     // face
          g.drawOval(90,70,80,80);
      //eyes
          g.drawOval(100,95,5,5);
          g.drawOval(145,95,5,5);
    //nose
         g.drawLine(130,95,130,115);
    //mouth
        g.drawArc(113,115,35,20,0,-180);
     }
        public static void main(String args[]) {
           //create the frame
            awt4 d=new awt4();
         //set the size and title
            d.setSize(400,400);
            d.setTitle("My drawing");
         //display the frame
             d.setVisible(true);
      }
 }

     
   