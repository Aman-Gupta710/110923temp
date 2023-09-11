package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class DeleteDetail extends JFrame implements ActionListener{
    
    JLabel lb1username,labelusername,lblId,lbnumber,
           labelnumber,labelid,lbname,labelname,lbgender,
           labelgender,lbcountry,labelcountry,lbaddress,
           labeladdress,lbphone,labelphone,lbemail,labelemail;
    JButton back;
    String username;
   DeleteDetail(String username){
       this.username = username;     //humne yha username ko globally store kervadiya
       setBounds(400,100,870,625);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       lb1username = new JLabel("Username :");
       lb1username.setBounds(30, 50, 150, 25);
       add(lb1username);
       labelusername = new JLabel();
       labelusername.setBounds(220, 50, 150, 25);
       add(labelusername);
       
       lblId = new JLabel("ID :");
       lblId.setBounds(30, 110, 150, 25);
       add(lblId);
       labelid = new JLabel();
       labelid.setBounds(220, 110, 150, 25);
       add(labelid);
       
       lbnumber = new JLabel("NUMBER :");
       lbnumber.setBounds(30, 170, 150, 25);
       add(lbnumber);
       labelnumber = new JLabel();
       labelnumber.setBounds(220, 170, 150, 25);
       add(labelnumber);
       
       lbname = new JLabel("Name :");
       lbname.setBounds(30, 230, 150, 25);
       add(lbname);
       labelname = new JLabel();
       labelname.setBounds(220, 230, 150, 25);
       add(labelname);
       
       lbgender = new JLabel("Gender :");
       lbgender.setBounds(30, 290, 150, 25);
       add(lbgender);
       labelgender = new JLabel();
       labelgender.setBounds(220, 290, 150, 25);
       add(labelgender);
       
       lbcountry = new JLabel("Country :");
       lbcountry.setBounds(500, 50, 150, 25);
       add(lbcountry);
       labelcountry = new JLabel();
       labelcountry.setBounds(690, 50, 150, 25);
       add(labelcountry);
       
       lbaddress = new JLabel("Address :");
       lbaddress.setBounds(500, 110, 150, 25);
       add(lbaddress);
       labeladdress = new JLabel();
       labeladdress.setBounds(690, 110, 150, 25);
       add(labeladdress);
       
       lbphone = new JLabel("Phone :");
       lbphone.setBounds(500, 170, 150, 25);
       add(lbphone);
       labelphone = new JLabel();
       labelphone.setBounds(690, 170, 150, 25);
       add(labelphone);
       
       lbemail = new JLabel("Email :");
       lbemail.setBounds(500, 230, 150, 25);
       add(lbemail);
       labelemail = new JLabel();
       labelemail.setBounds(690, 230, 150, 25);
       add(labelemail);
       
       back = new JButton("DELETE");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setBounds(350, 320, 100, 25);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/viewall.jpg"));
       Image i3 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(20,400,850,200);
       add(l1); 
       
       try{
           kite k  = new kite();
           String query = "select * from customer where username = '"+username+"'"; 
           ResultSet rs = k.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("number"));
               labelname.setText(rs.getString("name"));
               labelgender.setText(rs.getString("gender"));
               labelcountry.setText(rs.getString("country"));
               labeladdress.setText(rs.getString("address"));
               labelphone.setText(rs.getString("phone"));
               labelemail.setText(rs.getString("email"));
           }
       }catch(Exception e){
           
       }
       setVisible(true);
   }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
           try{
               kite k = new kite();
               k.s.executeUpdate("delete from account where username = '"+username+"'");
               k.s.executeUpdate("delete from customer where username = '"+username+"'");
               k.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
               k.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
               
               JOptionPane.showMessageDialog(null,"Account Deleted Sucessfully");
               setVisible(false);
               
           }catch(Exception e){
               e.printStackTrace();
           }
            
        }
    }    
    
   public static void main(String args[]){
        new DeleteDetail(""); 
   }    
}
