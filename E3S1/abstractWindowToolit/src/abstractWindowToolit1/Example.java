package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;


public class Example {
	
	Example() {
		
		Frame f = new Frame();
		
		Label la = new Label("Employee id : ");
		
		Button b = new Button("Submit");
		
		TextField t = new TextField();
		
		la.setBounds(20, 80, 80, 30);
		b.setBounds(100, 100, 80, 30);
		t.setBounds(20, 100, 80, 20);
		
		f.add(la);
		f.add(b);
		f.add(t);
		
		f.setSize(400, 300);
		
		
		f.setLayout(null);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		
	}

	public static void main(String[] args) {
		Example ex = new Example();

	}

}
