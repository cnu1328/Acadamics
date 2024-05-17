//A simple frame

//Draw backs of awt

// >> It is not portable.
// >> Because, The look and feel of the component, changes from 
// >> system to system, platform to platform  as awt uses the native
// >> methods of operating system.

// >> Awt components are heavy weight components.("uses more memory and more processor time")

// >> Java Foundation Class;

// >> swing is portable



import javax .swing.*;
class swing1 {
    public static void main(String args[])  {
          //create the frame with title
             JFrame obj=new JFrame(" My frame");
       
          obj.setSize(600,600);
      
       //display the frame
       obj.setVisible(true);
    }
}