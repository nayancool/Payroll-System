import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JLabel l1,l2;//for email and password
    JTextField f1;//for entering email
    JPasswordField f2;//for entering password
    JButton b1,b2;//for submit and cancel
    
    login(){
        super("Login Page");
        setLayout(new BorderLayout());
        f2=new JPasswordField(10);//10 length
        f1=new JTextField(10);
        JLabel l=new JLabel(new ImageIcon(ClassLoader.getSystemResource("icon\\defaultpic.png")));
        
       //button
       b1=new JButton("Submit", new ImageIcon(ClassLoader.getSystemResource("icon\\login.png")));
       b2=new JButton("Cancel", new ImageIcon(ClassLoader.getSystemResource("icon\\Cancel.png")));
       b1.addActionListener(this);
       b2.addActionListener(this);
       
       JPanel p1,p2,p3,p4;//same as like div tag in css
       p1=new JPanel();
       p2=new JPanel();
       p3=new JPanel();
       p4=new JPanel();
       
       add(l,BorderLayout.WEST);//defaultpic
       
       p2.add(new JLabel("User Name  :"));
       p2.add(f1);
       p2.add(new JLabel("Password   :"));
       p2.add(f2);
       add(p2,BorderLayout.CENTER);
       
       p4.add(b1);
       p4.add(b2);
       
       add(p4,BorderLayout.SOUTH);
       
       setVisible(true);
       setSize(400,250);
       setLocation(600,400);
       
    }
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c1=new Conn();
            String u=f1.getText();
            String v=f2.getText();
            String q="select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs=c1.s.executeQuery(q);//kisi query ko execute karane ke bad resultset uska answer save karta ahai
            if(rs.next()){//if query is correct then next frame will open which is project.java
                new project().setVisible(true);
                setVisible(false);//for closing current frame
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Login");//for popup
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new login();
    }
}
