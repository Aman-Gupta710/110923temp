package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackages  extends JFrame implements ActionListener{
    JLabel text,lb1username,labelusername,lblPackage,lbperson,lblId,labelid,
            lbnumber,labelnumber,lblphone,labelphone,lbltotal,labelprice;
    
    Choice choicepackage;
    JTextField tfpersons;
    JButton checkprice,BookPack,Back;
    
    String username;
    BookPackages(String username){
        this.username = username;
       setBounds(200,100,1100,500);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       
       text = new JLabel("-:   BOOK YOUR PACKAGE  :-");
       text.setBounds(400,10,300,30);
       text.setForeground(Color.RED);
       text.setFont(new Font("Tahoma",Font.BOLD,20));
       add(text);
                
       lb1username = new JLabel("Username :");
       lb1username.setBounds(40, 70, 150, 25);
       add(lb1username);
       labelusername = new JLabel();
       labelusername.setBounds(250, 70, 150, 25);
       add(labelusername);
       
       lblPackage = new JLabel("Select Package:");
       lblPackage.setBounds(40, 110, 200, 25);
       add(lblPackage);
       choicepackage = new Choice();
       choicepackage.add("Gold Package");
       choicepackage.add("Silver package");
       choicepackage.add("platinum Package");
       choicepackage.setBounds(250,110,150,20);
       add(choicepackage);
       
       lbperson = new JLabel("Total Persons:");
       lbperson.setBounds(40, 150, 200, 25);
       add(lbperson);
       tfpersons = new JTextField();
       tfpersons.setBounds(250, 150, 150, 25);
       add(tfpersons);
       
       lblId = new JLabel("ID :");
       lblId.setBounds(40, 190, 150, 20);
       add(lblId);
       labelid = new JLabel();
       labelid.setBounds(250, 190,  200, 25);
       add(labelid);
       
       lbnumber = new JLabel("Number :");
       lbnumber.setBounds(40, 230, 150, 25);
       add(lbnumber);
       labelnumber = new JLabel();
       labelnumber.setBounds(250, 230, 150, 25);
       add(labelnumber);
       
       lblphone = new JLabel("Phone :");
       lblphone.setBounds(40, 270, 150, 20);
       add(lblphone);
       labelphone = new JLabel();
       labelphone.setBounds(250, 270, 200, 25);
       add(labelphone);
       
       lbltotal = new JLabel("Total price :");
       lbltotal.setBounds(40, 310, 200, 25);
       add(lbltotal);
       labelprice = new JLabel();
       labelprice.setBounds(250, 310, 150, 25);
       add(labelprice);
       
       checkprice = new JButton("Check-Prices");
       checkprice.setBounds(60,380,120,25);
       checkprice.setBackground(Color.YELLOW);
       checkprice.setForeground(Color.BLUE);
       checkprice.addActionListener(this);
       add(checkprice);
       
       BookPack = new JButton("Book-Package");
       BookPack.setBounds(200,380,120,25);
       BookPack.setBackground(Color.YELLOW);
       BookPack.setForeground(Color.BLUE);
       BookPack.addActionListener(this);
       add(BookPack);
       
       Back = new JButton("Back");
       Back.setBounds(340,380,120,25);
       Back.setBackground(Color.YELLOW);
       Back.setForeground(Color.BLUE);
       Back.addActionListener(this);
       add(Back);
       
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/bookpackage.jpg"));
       Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(550,50,500,300);
       add(l1);

     
       try{
           kite k  = new kite();
           String query = "select * from customer where username = '"+username+"'"; 
           ResultSet rs = k.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("number"));
               labelphone.setText(rs.getString("phone"));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprice){
           String pack = choicepackage.getSelectedItem();
           int cost = 0;
           if(pack.equals("Gold Package")){
               cost += 12000;
           }else if(pack.equals("Silver package")){
               cost += 25000;
           }else{
               cost += 32000;
           }
           int person = Integer.parseInt(tfpersons.getText());
           cost *= person;
           labelprice.setText(cost +"/-");
        }else if(ae.getSource() == BookPack){
            try{
                kite k = new kite();
                k.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+choicepackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
           setVisible(false);
        }
    }
    
    public static void main(String args[]){
       new BookPackages("");      
    }    
}
