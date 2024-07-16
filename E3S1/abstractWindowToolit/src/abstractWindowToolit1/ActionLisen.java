package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class ActionLisen {
	
	
	TextField tf;
	
	ActionLisen() {
		
		Frame f = new Frame();
		
		tf = new TextField();
		
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("Click Me");
		
		b.setBounds(50, 120, 80, 30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello Srinu!!!");
			}
		});
		
		f.add(tf);		
		f.add(b);
		f.setSize(400, 500);
		
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		
		
	}

	public static void main(String[] args) {
		
		ActionLisen a = new ActionLisen();

	}

}
