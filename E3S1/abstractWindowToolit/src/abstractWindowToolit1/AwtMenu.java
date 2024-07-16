package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;


public class AwtMenu {
	
	AwtMenu() {
		Frame f = new Frame("Menu and MenuItem Example");
		
		MenuBar mb = new MenuBar();  
		Menu menu = new Menu("Menu"); 
		Menu submenu = new Menu("Sub Menu");  
        MenuItem i1 = new MenuItem("Item 1");  
        MenuItem i2 = new MenuItem("Item 2");  
        MenuItem i3 = new MenuItem("Item 3");  
        MenuItem i4 = new MenuItem("Item 4");  
        MenuItem i5 = new MenuItem("Item 5"); 
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        
        menu.add(submenu);
        submenu.add(i4);
        submenu.add(i5);
		
		mb.add(menu);
		f.setMenuBar(mb); 
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
		
		new AwtMenu();
	}

}
