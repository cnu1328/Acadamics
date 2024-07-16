package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtPanel {
	
	AwtPanel() {
		Frame f= new Frame("Panel Example");    
        Panel panel=new Panel(); 
        
        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.gray);
        
        Button b1=new Button("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.yellow);
        
        Button b2=new Button("Button 1");     
        b2.setBounds(100,100,80,30);    
        b2.setBackground(Color.red);
        
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        
        f.setLayout(null);    
	    f.setSize(400, 400);    
	    f.setVisible(true);
	    
	    f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}

	public static void main(String[] args) {
		new AwtPanel();

	}

}
