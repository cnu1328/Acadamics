import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Q3 extends Applet
{
public static JLabel l,l1,l2,l3;
public static JComboBox cb,cb1,cb2;
public static void main(String[] args){
Frame f = new Frame("String");
f.setSize(400, 400);
String colors[]={"select","red","blue","green"};
String sizes[]={"select","14","15","16"};
String type[]={"select","bold","italic","normal"};
l=new JLabel("Hello OOPS Java");
l.setBounds(100,200,300,100);
l1=new JLabel("color");
l1.setBounds(50,80,80,20);
l2=new JLabel("size");
l2.setBounds(160,80,80,20);
l3=new JLabel("type");
l3.setBounds(260,80,80,20);
cb=new JComboBox(colors);
cb.setBounds(50,100,80,20);
cb1=new JComboBox(sizes);
cb1.setBounds(160,100,70,20);
cb2=new JComboBox(type);
cb2.setBounds(260,100,70,20);
f.add(cb);
f.add(cb1);
f.add(cb2);
f.add(l);
f.add(l1);
f.add(l2);
f.add(l3);
cb.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
if (cb.getSelectedItem()=="red") {
l.setForeground(Color.red);
}else if (cb.getSelectedItem()=="blue") {
l.setForeground(Color.blue);
}else if(cb.getSelectedItem()=="green"){
l.setForeground(Color.green);
} } });
cb2.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
if (cb2.getSelectedItem()=="bold") {
l.setFont(new Font("Verdana", Font.BOLD, 14));
}if (cb2.getSelectedItem()=="italic") {
l.setFont(new Font("Verdana", Font.ITALIC, 15));
} if(cb2.getSelectedItem()=="normal"){
l.setFont(new Font("Verdana", Font.PLAIN, 16));
} } });
cb1.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
if (cb1.getSelectedItem()=="14") {
l.setFont(new Font("Verdana", Font.PLAIN, 14));
}else if (cb1.getSelectedItem()=="15") {
l.setFont(new Font("Verdana", Font.PLAIN, 15));
}else if(cb1.getSelectedItem()=="16"){
l.setFont(new Font("Verdana", Font.PLAIN, 16));
} } });
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
} }); } }