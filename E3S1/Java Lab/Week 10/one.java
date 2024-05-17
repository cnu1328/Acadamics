Program:
import java.awt.Graphics;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class Q1 extends Applet
{ public void paint(Graphics g)
{
g.drawString("Horizontal line", 120, 50);
g.drawString("Perpendicular lines", 120, 150);
g.drawString("Parallel lines", 120, 250);
g.setColor(Color.blue);
//Syntax For:- drawLine(int x1, int y1, int x2, int y2);
g.drawLine(20, 50, 90, 50);
g.setColor(Color.green);
g.drawLine(55, 100, 55, 150);
g.setColor(Color.green);
g.drawLine(20, 150, 90, 150);
g.setColor(Color.red);
g.drawLine(40, 200, 40, 250);
g.setColor(Color.red);
g.drawLine(70, 200, 70, 250);
}
public static void main(String[] args) {
Frame f=new Frame();
f.setTitle("My Frame");
Applet app=new Q1();
f.add(app);
f.setSize(300,300);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
} }