package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtPopUpMenu {
	
	AwtPopUpMenu() {
		final Frame f= new Frame("PopupMenu Example"); 
		final PopupMenu popupmenu = new PopupMenu("Edit");
		MenuItem cut = new MenuItem("Cut");
		cut.setActionCommand("Cut");
		
		MenuItem copy = new MenuItem("Copy");  
	 	copy.setActionCommand("Copy");  
	 	
	 	MenuItem paste = new MenuItem("Paste");  
        paste.setActionCommand("Paste");  
        
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        
        f.add(popupmenu);
        
        f.setLayout(null);    
	    f.setSize(400, 400);    
	    f.setVisible(true);
	    
	    f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	    
	    f.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e) {
	    		popupmenu.show(f,  e.getX(), e.getY());
	    	}
	    });
	 	
	}

	public static void main(String[] args) {
		new AwtPopUpMenu();

	}

}
