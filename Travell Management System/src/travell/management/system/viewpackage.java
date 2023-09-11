package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class viewpackage extends JFrame implements ActionListener{
    
    JLabel lb1username,labelusername,lblId,lbnumber,
           labelnumber,labelid,lbname,labelname,lbgender,
           labelgender,lbcountry,labelcountry,lbaddress,
           labeladdress,lbphone,labelphone,lbemail,labelemail;
    JButton back;
   viewpackage(String username){
       setBounds(300,100,870,625);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       lb1username = new JLabel("Username :-");
       lb1username.setBounds(30, 50, 150, 25);
       add(lb1username);
       labelusername = new JLabel();
       labelusername.setBounds(220, 50, 150, 25);
       add(labelusername);
       
       lblId = new JLabel("Selectedpackage :-");
       lblId.setBounds(30, 110, 150, 25);
       add(lblId);
       labelid = new JLabel();
       labelid.setBounds(220, 110, 150, 25);
       add(labelid);
       
       lbnumber = new JLabel("Persons :-");
       lbnumber.setBounds(30, 170, 150, 25);
       add(lbnumber);
       labelnumber = new JLabel();
       labelnumber.setBounds(220, 170, 150, 25);
       add(labelnumber);
       
       lbname = new JLabel("Id :-");
       lbname.setBounds(30, 230, 150, 25);
       add(lbname);
       labelname = new JLabel();
       labelname.setBounds(220, 230, 150, 25);
       add(labelname);
       
       lbgender = new JLabel("Id Number :-");
       lbgender.setBounds(30, 290, 150, 25);
       add(lbgender);
       labelgender = new JLabel();
       labelgender.setBounds(220, 290, 150, 25);
       add(labelgender);
       
       lbcountry = new JLabel("Phone :-");
       lbcountry.setBounds(30, 350, 150, 25);
       add(lbcountry);
       labelcountry = new JLabel();
       labelcountry.setBounds(220, 350, 150, 25);
       add(labelcountry);
       
       lbaddress = new JLabel("Price :-");
       lbaddress.setBounds(30, 410, 150, 25);
       add(lbaddress);
       labeladdress = new JLabel();
       labeladdress.setBounds(220, 410, 150, 25);
       add(labeladdress);
       
       back = new JButton("Back");
       back.setBackground(Color.ORANGE);
       back.setForeground(Color.BLACK);
       back.setBounds(250, 465, 400, 60);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/bookedDetails.jpg"));
       Image i3 = i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(400,20,500,400);
       add(l1); 
       
       try{
           kite k  = new kite();
           String query = "select * from bookpackage where username = '"+username+"'"; 
           ResultSet rs = k.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("selectedpackage"));
               labelnumber.setText(rs.getString("persons"));
               labelname.setText(rs.getString("id"));
               labelgender.setText(rs.getString("idnumber"));
               labelcountry.setText(rs.getString("phone"));
               labeladdress.setText(rs.getString("price"));
           }
       }catch(Exception e){
           
       }
       setVisible(true);
   }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
        }
    }    
    
   public static void main(String args[]){
        new viewpackage(""); 
   }    
}
