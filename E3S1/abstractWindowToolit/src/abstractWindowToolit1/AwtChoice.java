package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtChoice {
	
	AwtChoice() {    
		  
        // creating a frame  
        Frame f = new Frame();    
        
        
        final Label label = new Label();   
        
        // setting alignment and size of label component           
        label.setAlignment(Label.CENTER);    
        label.setSize(400, 100); 
        
        Button b = new Button("Show"); 
  
        b.setBounds(200, 100, 50, 20);    
        
        // creating final object of Choice class  
        final Choice c = new Choice();    
  
        // setting the bounds of choice menu   
        c.setBounds(100, 100, 100, 100);    
  
        // adding items to the choice menu  
        c.add("Select a Programming Language");
        c.add("C");    
        c.add("C++");    
        c.add("Java");    
        c.add("PHP");    
        c.add("Android");    
  
        // adding choice menu to frame  
        f.add(c);    
        f.add(label);
        f.add(b);
  
        // setting size, layout and visibility of frame  
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {         
	         String data = "Programming language Selected: "+ c.getItem(c.getSelectedIndex());    
	         label.setText(data);    
        }    
        }); 
        
        f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
     }
	
	public static void main(String[] args) {
		new AwtChoice();
	}

}
