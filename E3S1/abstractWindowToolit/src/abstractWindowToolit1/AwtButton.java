package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;


public class AwtButton {
	
	//Example 2;
	
	Frame f;
	Button b1, b2, b3;
	TextField tf;
	
	AwtButton() {
		f = new Frame("Frame to dispaly buttons");
		
		b1 = new Button();
		b2 = new Button("Click Here");
		b3 = new Button();
		tf = new TextField();
		
		b3.setLabel("button 3");
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tf);
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to the Microsoft");
			}
		});
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
	//A button is basically a control component with a label that generates an event when pushed. 
	//The Button class is used to create a labeled button that has platform independent implementation.
	//The application result in some action when the button is pushed.

	public static void main(String[] args) {
		
		
		new AwtButton();
		
//		Example one
		/*
		Frame f = new Frame();
		
		Button b = new Button("Click Here");
		
		b.setBounds(50, 100, 80, 30);
		
		f.add(b);
		
		f.setSize(400, 400);
		
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		*/

	}

}
