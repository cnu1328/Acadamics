package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtList {
	
	AwtList() {
		Frame f = new Frame();   
		
		final Label label = new Label(); 
		
		 label.setAlignment(Label.CENTER);    
	     label.setSize(500, 100);
	     
	     Button b = new Button("Show");  
	     
        // setting location of button    
        b.setBounds(100, 210, 80, 30); 
	        
       // creating the list of 5 rows   
        List l1 = new List(5, false);   
        
        // setting the position of list component   
        l1.setBounds(100, 100, 150, 100);    
  
        // adding list items into the list  
        l1.add("C");    
        l1.add("C++");    
        l1.add("Java");    
        l1.add("PHP");    
        l1.add("JavaScript");   
        
        final List l2=new List(4, true);    
        l2.setBounds(100, 250, 100, 100);    
        l2.add("Turbo C++");    
        l2.add("Spring");    
        l2.add("Hibernate");    
        l2.add("CodeIgniter");   
  
        // adding the list to frame  
        f.add(l1); 
        f.add(l2);
        f.add(label);
        f.add(b);
        
        b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String data = "Programming Language Selected : " + l1.getItem(l1.getSelectedIndex());
        		
        		data += " and Selected Frame is : ";
        		
        		for(String frame : l2.getSelectedItems()) {
        			data += frame + " ";
        		}
        		
        		label.setText(data);
        	}
        });
  
        // setting size, layout and visibility of frame  
        f.setSize(400, 400);    
        f.setLayout(null);    
	    f.setVisible(true);
	    
	    f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}

	public static void main(String[] args) {
		new AwtList();

	}

}
