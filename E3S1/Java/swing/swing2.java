//A simple frame
import javax .swing.*;
class swing2  extends JFrame{
    public static void main(String args[])  {
          //create the frame with title
             swing2 obj=new swing2();

//set the title for the frame
obj.setTitle("My swing frame");

       
          obj.setSize(600,600);
      
       //display the frame
       obj.setVisible(true);

//close the application upon clicking the close button , it is a method of JFrame class
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}