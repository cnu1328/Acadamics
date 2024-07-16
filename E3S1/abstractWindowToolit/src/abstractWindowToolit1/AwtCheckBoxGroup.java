package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtCheckBoxGroup {
	AwtCheckBoxGroup(){    
       Frame f= new Frame("CheckboxGroup Example");  
       
       final Label label = new Label();          
       label.setAlignment(Label.CENTER);  
       label.setSize(400,100); 
       
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
        checkBox1.setBounds(100,100, 50,50);    
        Checkbox checkBox2 = new Checkbox("Java", cbg, true);    
        checkBox2.setBounds(100,150, 50,50);    
        f.add(checkBox1);    
        f.add(checkBox2);   
        f.add(label);
        
        checkBox1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               label.setText("C++ checkbox: Checked");  
            }  
         });  
        
        checkBox2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               label.setText("Java checkbox: Checked");  
            }  
         });  
        
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true); 
        
        f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
        
        
    }   
	
	public static void main(String args[])    
	{    
	    new AwtCheckBoxGroup();    
   
	}  
}
