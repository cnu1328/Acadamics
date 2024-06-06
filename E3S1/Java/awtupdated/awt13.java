import java.awt.*;
import java.awt.event.*;
class awt13 extends Frame implements ActionListener {
    //vars
       TextField name,pass;
      awt13() {
        //set layout to flow layout
      setLayout(new FlowLayout());

     //create 2 labels
     Label n=new Label("Name :",Label.LEFT);
     Label p=new Label("Password :",Label.LEFT);

    //create text fields for name and password
      name=new TextField(20);
     pass=new TextField(20);

     //hide the password by *
    pass.setEchoChar('*');

//USe background,foreground colors and font for name textfield
  name.setBackground(Color.yellow);
  name.setForeground(Color.red);
Font f=new Font("Arial",Font.PLAIN,25);
name.setFont(f);

//add the labels and textfields to frame
add(n);
add(name);
add(p);
add(pass);

//add actionlisteners to text fields
name.addActionListener(this);
pass.addActionListener(this);

//close the frame
                 addWindowListener(new WindowAdapter() {
                      public void windowClosing(WindowEvent we) {
                                  System.exit(0);
                       }
                    });
}

//this method is executed when enter us clicked , display the etxt entered into the text fields
public void actionPerformed(ActionEvent ae) {
             //create the graphics class object
        Graphics g=this.getGraphics();
       
       g.drawString("Name:"+name.getText(),10,200);
     g.drawString("Password:"+pass.getText(),10,240);
}

public static void main(String args[]) {
    //create the frame
    awt13 mt=new awt13();
    mt.setTitle("My text field");
    mt.setSize(400,400);
mt.setVisible(true);
 }
}