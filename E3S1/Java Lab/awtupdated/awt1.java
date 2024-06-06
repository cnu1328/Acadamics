import java.awt.*;
import java.awt.event.*;
class awt1 {

 public static void main(String args[]) {
   	Frame f=new Frame("My AWT frame");
     	f.setSize(1000,850);
     	f.setVisible(true);

	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();
		}
	});
    }
}