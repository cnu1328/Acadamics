import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class  FormData{
    public static void main(String[] args){
    Frame f=new Frame();
    Label label1=new Label("First Name: ");
    Label label2=new Label("Last Name: ");
    Label label3=new Label("Email: ");
    Label label4=new Label("Address: ");
    Label label5=new Label("Contact No: ");
    final TextField text1=new TextField(20);
    final TextField text2=new TextField(20);
    final TextField text3=new TextField(20);
    final TextField text4=new TextField(20);
    final TextField text5=new TextField(20);
    Button b=new Button("Save");
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        String v1=text1.getText();
        String v2=text2.getText();
        String v3=text3.getText();
        String v4=text4.getText();
        String v5=text5.getText();
        try{
           //step1 load the driver class  
    Class.forName("com.mysql.cj.jdbc.Driver");  
      
    //step2 create  the connection object  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgukt","root","amma1328");  
           Statement st = con.createStatement();
           int i=st.executeUpdate("insert into stdd values('"+v1+"','"+v2+"','"+v3+"','"+v4+"','"+v5+"')");
           JOptionPane.showMessageDialog(null,"Data is inserted successfully");
        }
        catch(Exception ex){
        System.out.println(ex);
         }
       }
        });
        Panel p=new Panel(new GridLayout(6,2));
        p.add(label1);
        p.add(text1);
        p.add(label2);
        p.add(text2);
        p.add(label3);
        p.add(text3);
        p.add(label4);
        p.add(text4);
        p.add(label5);
        p.add(text5);
        p.add(b);
        f.add(p);
        f.setVisible(true);
        f.pack();
    }
}