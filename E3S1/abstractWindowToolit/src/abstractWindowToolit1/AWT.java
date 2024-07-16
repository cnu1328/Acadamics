package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AWT extends Frame {
	
	//GUI : GUI facilitates the user to interact with the application through some graphical entities.
	
	// AWT : Abstract window toolkit- It is a class lbrary to develop GUI in java
	
	// Component : It is a graphical representaion of an object
	
	//Window: Widnow represents an imaginary rectangleular area on the screen without any borders and title bar.
	
	//Frame : Frame represents a window with title & boarders
	
	//>> A frame is a basic components in AWT
	//>> A frame has to be created before creation of any other components and all ohter compnents are displayed on the farame.
	
	
	
	AWT() {
		
		Button b = new Button("Click  Me!!");
		
		b.setBounds(30, 100, 80, 30);
		
		add(b);
		
		setSize(300, 300);
		
		setLayout(null);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}

	public static void main(String[] args) {
		
		AWT f = new AWT();
	}

}
