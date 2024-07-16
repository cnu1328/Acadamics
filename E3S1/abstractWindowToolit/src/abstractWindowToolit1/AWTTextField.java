package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AWTTextField implements ActionListener{

//	The object of a TextField class is a text component that allows a user to enter a single line text and edit it. 
	//It inherits TextComponent class, which further inherits Component class.
	
	TextField t1, t2, t3;
	Button b1, b2, b3;
	
	AWTTextField() {
		Frame f = new Frame("TextField Example");
		
		
		
		t1 = new TextField();
		t1.setBounds(50, 50, 150, 20);
		
		t2 = new TextField();
		t2.setBounds(50, 100, 150, 20);
		
		t3 = new TextField();
		t3.setBounds(50, 200, 150, 20);
		
		
		
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("*");
		
		b1.setBounds(50, 210, 50, 50);
		b2.setBounds(100, 210, 50, 50);
		b3.setBounds(150, 210, 50, 50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		String s2 = t2.getText();
		int first, second;
		
		try {
			first = Integer.parseInt(s1);
		}
		catch(Exception e1) {
			first = 0;
			t1.setText("Number plz...");
		}
		
		try {
			second = Integer.parseInt(s2);
			
		} catch(Exception e1) {
			second = 0;
			t2.setText("Number plz...");
		}
		
		int c = 0;
		
		if(e.getSource() == b1) {
			c = first + second;
		}
		
		else if(e.getSource() == b2) {
			c = first - second;
		}
		
		else if(e.getSource() == b3) {
			c = first*second;
		}
		
		String result =	String.valueOf(c);
		
		t3.setText(result);
	}
	
	public static void main(String[] args) {
		
		new AWTTextField();
		
//		Frame f = new Frame("TextField Example");
//		
//		TextField t1, t2, t3;
		
//		t1 = new TextField("Welcome to JavatPoint");
//		t1.setBounds(50, 100, 200, 30);
//		
//		t2 = new TextField("AWT Tutorial");
//		t2.setBounds(50, 150, 200, 30);
		
//		t1 = new TextField();
//		t1.setBounds(50, 50, 150, 20);
//		
//		t2 = new TextField();
//		t2.setBounds(50, 100, 150, 20);
//		
//		t3 = new TextField();
//		t3.setBounds(50, 200, 150, 20);
//		
//		Button b1, b2;
//		
//		b1 = new Button("+");
//		b2 = new Button("-");
//		
//		b1.setBounds(50, 200, 50, 50);
//		b2.setBounds(120, 200, 50, 50);
//		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		
//		f.add(t1);
//		f.add(t2);
//		
//		f.setSize(400, 400);
//		f.setLayout(null);
//		f.setVisible(true);
//		
//		f.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				f.dispose();
//			}
//		});
		
		
	}

}
