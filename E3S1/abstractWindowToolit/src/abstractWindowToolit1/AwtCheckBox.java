package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtCheckBox {
	
	AwtCheckBox() {
		Frame f = new Frame("Checkbox Example");
		
		final Label label = new Label();
		
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);
		
		Checkbox c1 = new Checkbox("C++");
		c1.setBounds(100, 100, 50, 50);
		
		Checkbox c2 = new Checkbox("Java", true);
		c2.setBounds(100, 150, 50, 50);
		
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox :  " + (e.getStateChange() == 1?"Checed" : "Unchecked"));
			}
		});
		
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("Java Checkbox : " + (e.getStateChange() == 1?"Checked" : "Unchecked"));
			}
		});
		
		f.add(c1);
		f.add(c2);
		f.add(label);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 400);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		
	}

	public static void main(String[] args) {
		new AwtCheckBox();

	}

}
