package abstractWindowToolit1;

import java.awt.*;
import java.awt.event.*;

public class AwtTextArea implements ActionListener {
	
	Label l1, l2;
	TextArea area;
	Button b;
	
	AwtTextArea() {
		Frame f = new Frame();
		
		l1 = new Label("Words : ");
		l1.setBounds(50, 50, 100, 30);
		
		l2 = new Label("Characters : ");
		l2.setBounds(160, 50, 100, 30);
		
		
		area = new TextArea();
		area.setBounds(20, 100, 200, 100);
		
		b = new Button("Count Words");
		b.setBounds(100, 250, 100, 30);
		
		b.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		
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
		String text = area.getText();
		String words[] = text.split("\\s");
		l1.setText("Words : " + words.length);
		l2.setText("Characters : " + text.length());
	}

	public static void main(String[] args) {
		new AwtTextArea();

	}

}
