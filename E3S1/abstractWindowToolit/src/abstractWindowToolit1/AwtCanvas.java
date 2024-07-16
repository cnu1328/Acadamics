package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtCanvas {
	
	AwtCanvas() {
		 Frame f = new Frame("Canvas Example");   
	    // adding canvas to frame   
	    f.add(new MyCanvas());    
	  
	    // setting layout, size and visibility of frame  
	    f.setLayout(null);    
	    f.setSize(400, 400);    
	    f.setVisible(true);
	    
	    f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}
	
	class MyCanvas extends Canvas {
		
		public MyCanvas() {    
	        setBackground (Color.GRAY);    
	        setSize(300, 200);    
	     }
		
		public void paint(Graphics g) {    
	  
	    // adding specifications  
		  g.setColor(Color.red);    
	      g.fillOval(75, 75, 150, 75);    
	   }    
		
	}

	public static void main(String[] args) {
		
		new AwtCanvas();
	}

}
