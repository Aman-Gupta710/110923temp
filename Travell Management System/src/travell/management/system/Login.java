package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    
    Login(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(600,400);
        setLocation(400,150);
        
        
        // This is use to create a half color on frame diffrece ,go to hell, not come back
        p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,300,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(55,70,200,200);
        p1.add(l1);
        
        p2 = new JPanel();
        p2.setBounds(300,30,300,300);
        p2.setLayout(null);
        add(p2);
        
        l2 = new JLabel("Username");
        l2.setBounds(40,20,100,25);
        l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(40,50,200,25);
        p2.add(t1);
        
        l3 = new JLabel("Password");
        l3.setBounds(40,90,100,25);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l3);
        
        t2 = new JTextField();
        t2.setBounds(40,130,200,25);
        p2.add(t2);
        
        b1 = new JButton("Login");
        b1.setBounds(40,180,100,20);
        b1.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        b1.addActionListener(this);
        p2.add(b1);
        
        b2= new JButton("Sign-up");
        b2.setBounds(145,180,95,20);
        b2.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        b2.addActionListener(this);
        p2.add(b2);
        
//        b3= new JButton("Forget Password");
//        b3.setBounds(40,220,200,20);
//        b3.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
//        b3.addActionListener(this);
//        p2.add(b3);
                       
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b2){
           setVisible(false);
           new signup();
        }else if(ae.getSource() == b1){
          try{
              String username = t1.getText();
              String Pass = t2.getText();
           
              String query = "select * from account where username = '"+username+"' AND password = '"+Pass+"'";
              kite k = new kite();
              ResultSet rs = k.s.executeQuery(query);
                if(rs.next()){         //mtlb if 'rs' object me 'k' ka data aajata h tho, ye vali condition chlni chaiye or loading page visible ho jana chaiye
                   setVisible(false);
                   new Loading(username);
                }else {
                   JOptionPane.showMessageDialog(null, "Invalid Username or Password");  
                }
          }catch(Exception e){
              e.printStackTrace();
          }
        }
    }
    
    public static void main(String args[]){
       new Login();    
    }
}
