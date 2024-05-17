Program:
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Q2 extends Applet
{
public static void main(String[] args){
Frame f = new Frame("Circle Rectangle");
f.setSize(300, 300);
Applet frame1 = new Q2();
f.add(frame1);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
Frame f = new Frame("Circle Rectangle");
wAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0); });
}
public void paint(Graphics g) {
// Rectangle
g.setColor(Color.yellow);
g.drawRect(60,90,160,80);
g.fillRect(60,90,160,80);
//Circle
g.setColor(Color.blue);
g.drawOval(115,105,50,50); //Oval(int x1,int y1, int width,
int height)
g.fillOval(115,105,50,50);
} }