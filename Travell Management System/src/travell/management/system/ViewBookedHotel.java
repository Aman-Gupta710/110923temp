package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JLabel lb1username,labelusername,lblId,lbnumber,
           labelnumber,labelid,lbname,labelname,lbgender,
           labelgender,lbcountry,labelcountry,lbaddress,
           labeladdress,lbphone,labelphone,lbemail,labelemail,
            lb1head,lbdays,lbac,lbfood,labeldays,labelac,
            labelfood;
    JButton back;
   ViewBookedHotel(String username){
       setBounds(300,100,1000,600);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       lb1head = new JLabel("View Your Booked Hotel :-");
       lb1head.setBounds(30, 0, 275, 25);
       lb1head.setFont(new Font("Tahoma",Font.BOLD,20));
       lb1head.setForeground(Color.RED);
       add(lb1head);
       
       lb1username = new JLabel("Username :-");
       lb1username.setBounds(30, 40, 150, 25);
       add(lb1username);
       labelusername = new JLabel();
       labelusername.setBounds(190, 40, 150, 25);
       labelusername.setForeground(Color.ORANGE);
       add(labelusername);
       
       lbname = new JLabel("Hotel Name :-");
       lbname.setBounds(30, 80, 150, 25);
       add(lbname);
       labelname = new JLabel();
       labelname.setBounds(190, 80, 150, 25);
       labelname.setForeground(Color.ORANGE);
       add(labelname);
       
       lbnumber = new JLabel("Persons :-");
       lbnumber.setBounds(30, 120, 150, 25);
       add(lbnumber);
       labelnumber = new JLabel();
       labelnumber.setBounds(190, 120, 150, 25);
       labelnumber.setForeground(Color.ORANGE);
       add(labelnumber);
       
       lbdays = new JLabel("Total Days :-");
       lbdays.setBounds(30, 160, 150, 25);
       add(lbdays);
       labeldays = new JLabel();
       labeldays.setBounds(190, 160, 150, 25);
       labeldays.setForeground(Color.ORANGE);
       add(labeldays);
       
       lbac = new JLabel("AC/Non-AC :-");
       lbac.setBounds(30, 200, 150, 25);
       add(lbac);
       labelac = new JLabel();
       labelac.setBounds(190, 200, 150, 25);
       labelac.setForeground(Color.ORANGE);
       add(labelac);

       lbfood = new JLabel("Food :-");
       lbfood.setBounds(30, 240, 150, 25);
       add(lbfood);
       labelfood = new JLabel();
       labelfood.setBounds(190, 240, 150, 25);
       labelfood.setForeground(Color.ORANGE);
       add(labelfood);       
       
       
       lblId = new JLabel("Id :-");
       lblId.setBounds(30, 280, 150, 25);
       add(lblId);
       labelid = new JLabel();
       labelid.setBounds(190, 280, 150, 25);
       labelid.setForeground(Color.ORANGE);
       add(labelid);
       
       lbgender = new JLabel("Id Number :-");
       lbgender.setBounds(30, 320, 150, 25);
       add(lbgender);
       labelgender = new JLabel();
       labelgender.setBounds(190, 320, 150, 25);
       labelgender.setForeground(Color.ORANGE);
       add(labelgender);
       
       lbcountry = new JLabel("Phone :-");
       lbcountry.setBounds(30, 360, 150, 25);
       add(lbcountry);
       labelcountry = new JLabel();
       labelcountry.setBounds(190, 360, 150, 25);
       labelcountry.setForeground(Color.ORANGE);
       add(labelcountry);
       
       lbaddress = new JLabel("Price :-");
       lbaddress.setBounds(30, 400, 150, 25);
       add(lbaddress);
       labeladdress = new JLabel();
       labeladdress.setBounds(190, 400, 150, 25);
       labeladdress.setForeground(Color.ORANGE);
       add(labeladdress);
       
       back = new JButton("Back");
       back.setBackground(Color.GREEN);
       back.setForeground(Color.BLACK);
       back.setBounds(250, 455, 400, 60);
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
           String query = "select * from bookhotel where username = '"+username+"'"; 
           ResultSet rs = k.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelname.setText(rs.getString("name"));
               labelnumber.setText(rs.getString("persons"));
               labeldays.setText(rs.getString("days"));
               labelac.setText(rs.getString("ac"));
               labelfood.setText(rs.getString("food"));
               labelid.setText(rs.getString("id"));
               labelgender.setText(rs.getString("number"));
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
        new ViewBookedHotel(""); 
   }    
}
