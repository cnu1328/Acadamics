//button displays image when clicked
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class swing5 extends JFrame implements ActionListener {
      JButton b;
     JLabel lbl;
    
     swing5() {
             //create the container
              Container c=getContentPane();
              //set layout for container
             c.setLayout(new FlowLayout());

// store the image into imageIcon object
ImageIcon ii=new ImageIcon("plane.jpg");
//create the button with image
b=new JButton("click me",ii);

//set the background and foreground colors for button
 b.setBackground(Color.yellow);
b.setForeground(Color.red);

//set font for the label of button
b.setFont(new Font("Arial",Font.BOLD,30));

//set bevel border for button
Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
b.setBorder(bd);

//set tool tip for button
b.setToolTipText("This is a Button");

//set a short cut key for a button. Alt+c will invoke the button
b.setMnemonic('C');
//add the button to the container
c.add(b);

//add action listener to button
b.addActionListener(this);

//create an empty label and add to the content pane
lbl=new JLabel();
c.add(lbl);

//close the frame upon clicking
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae) {
             //set some image to the label, this image is displayed when the button is clicked
 ImageIcon ii=new ImageIcon("atm.jpg");
  lbl.setIcon(ii);
}

public static void main(String args[]) {
               //create the frame
               swing5 obj=new swing5();

             obj.setTitle("My Button");
           obj.setSize(800,600);
        obj.setVisible(true);
   }
} 
