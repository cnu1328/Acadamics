package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AWTLabel {
	
	//The object of the Label class is a component for placing text in a container. 
	//It is used to display a single line of read only text. The text can be changed 
	//by a programmer but a user cannot edit it directly.

	//It is called a passive control as it does not create any event when it is accessed. 
	//To create a label, we need to create the object of Label class.
	
	TextField tf;
	Label la;
	Button b;
	
	
	
	AWTLabel() {
		
		Frame f = new Frame("Label Example");
	
		tf = new TextField();
		
		tf.setBounds(50, 50, 150, 20);
		
		la = new Label();
		la.setBounds(50, 100, 100, 30);
		
		
		b = new Button("Find Ip");
		b.setBounds(50, 150, 60, 30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String host = tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					la.setText("Ip of " + host + " is: " + ip);
					
				}  catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		
		f.add(tf);
		f.add(la);
		f.add(b);
		
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
		
		new AWTLabel();
//		Frame f = new Frame("Label Example");
//		
//		Label l1, l2;
//		
//		l1 = new Label("First Label");
//		l2 = new Label("Second Label");
//		
//		l1.setBounds(50, 100, 100, 30);
//		l2.setBounds(50, 150, 100, 30);
//		
//		f.add(l1);
//		f.add(l2);
//		
//		f.setLayout(null);
//		f.setSize(400, 400);
//		f.setVisible(true);
//		
//		f.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				f.dispose();
//			}
//		});
	

	}

}
