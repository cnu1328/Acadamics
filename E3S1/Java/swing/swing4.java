//a simple frma ewith background  color and text
import javax.swing.*;
import java.awt.*;//container class
class MyPanel extends JPanel {
        MyPanel() {
               this.setBackground(Color.green);
       }
       public void paintComponent(Graphics g) {
              super.paintComponent(g);
              g.setColor(Color.red);
            g.setFont(new Font("Helvetica",Font.BOLD,34));
       g.drawString(" welcome to swings ",50,100);
  }
}

class swing4 extends JFrame {
        swing4() {
                 //create content pane
              Container c=this.getContentPane();
             
             //create Mypanel object and add it to c
             MyPanel mp=new MyPanel();
       c.add(mp);

}

public static void main(String args[]) {
     //create the frame
       swing4 obj=new swing4();
     
     //set the title for the frame
    obj.setTitle("My swing frame");

    //set the size 
     obj.setSize(600,600);

//display the frame
obj.setVisible(true);

//close the app upon clicking close button
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}
}