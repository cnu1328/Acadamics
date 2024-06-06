//A simple frame
import javax .swing.*;
import java.awt.*;//container class
class swing3  extends JFrame{
    public static void main(String args[])  {
          //create the frame with title
             swing3 obj=new swing3();
//create the content pane. it is nothing but container object c
    Container c=obj.getContentPane();

  //set green back ground color to c
c.setBackground(Color.green);


//set the title for the frame
obj.setTitle("My swing frame");

       
          obj.setSize(600,600);
      
       //display the frame
       obj.setVisible(true);

//close the application upon clicking the close button , it is a method of JFrame class
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}