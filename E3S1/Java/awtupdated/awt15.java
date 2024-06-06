//List box demo
import java.awt.*;
import java.awt.event.*;
class awt15 extends Frame implements ItemListener {
   //vars
   int[] msg;
   List lst;

    awt15() {
          //set flow layout to frame
         setLayout(new FlowLayout());

      //create an empty list box that displays 4 items initially 
   lst=new List(4,true);

     //add some items to list box
   lst.add("OOP");
   lst.add("COA");
  lst.add("FLAT");
  lst.add("SL");
  lst.add("DAA");
  lst.add("OS");
  lst.add("DM");
  lst.add("DBMS");
  lst.add("AI");
  lst.add("CNW");
   lst.add("DL");
  lst.add("PS");
  lst.add("SE");
  lst.add("WT");
   
//add the list box to frame
 add(lst);

//add item listener to the list box
lst.addItemListener(this);

//close the frame
addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                       System.exit(0);
                }
  });

}

//this method is called when any item is clicked
public void itemStateChanged(ItemEvent ie) {
   //call paint() method
    repaint();
}


//display selected items from choice menu
public void paint(Graphics g)
{
     g.drawString("slected subjects :", 100,200);
    //get the selected items position numbers into msg[]
   msg=lst.getSelectedIndexes();
    //know each selected items name and display
    for(int i=0;i<msg.length;i++)
   {
               String item=lst.getItem(msg[i]);
               g.drawString(item,100,220+i*20);
}
}

public static void main(String args[]) {
   //create frame
    awt15 mc=new awt15();
   mc.setTitle("My List box");
   mc.setSize(400,400);
  mc.setVisible(true);
 }
}