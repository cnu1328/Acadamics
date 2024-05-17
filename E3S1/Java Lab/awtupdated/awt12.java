import java.awt.*;
import java.awt.event.*;
class awt12 extends Frame implements ItemListener {
   String msg="";
      CheckboxGroup cbg;
   Checkbox y,n;
      awt12() { 
         //do not set anylayout
         this.setLayout(new FlowLayout()); 
    //FlowLayout, BorderLayout, CardLayout, GridLayout, GridBagLayout

//create checkboxgroup object
cbg=new CheckboxGroup();

          //create 2 radio buttons
           y=new Checkbox("male",cbg,true);
           n=new Checkbox("female",cbg,false);
 
          //add the radio buttons to the frame
             add(y);
             add(n);

    //add item listener to the radio buttons
             y.addItemListener(this);
             n.addItemListener(this);

//close the frame
addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                       System.exit(0);
                }
  });
}

//this method is called when the radio button is clicked
public void itemStateChanged(ItemEvent ie) {

  repaint();  //calls paint method
}
   //display the selected radio label
public void paint(Graphics g) {
   msg="selected gender is :  ";
msg+=cbg.getSelectedCheckbox().getLabel();
   g.drawString(msg,10,100);
}

public static void main(String args[]) {
       //create the frame
             awt12 mb=new awt12();
             mb.setSize(400,400);
              mb.setTitle(" Push buttons to change background");
              mb.setVisible(true);
  }
}