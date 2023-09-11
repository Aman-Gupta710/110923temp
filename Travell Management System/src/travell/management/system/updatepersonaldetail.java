package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class updatepersonaldetail extends JFrame  implements ActionListener{
    
    JLabel lb1username,labelusername,lblId,lbnumber,lb1name,labelname,lbgender,lblCountry,lblAddress,lblphone,lblEmail,text; 
    JComboBox comboid,combocountry;
    JTextField tfnumber,t3country,t3Address,t3phone,t3Email,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton update,back;
    
    updatepersonaldetail(String username){
        setBounds(300,70, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        text = new JLabel("Update Personal Detail");
        text.setFont(new Font("Serif",Font.ITALIC,20));
        text.setForeground(Color.RED);
        text.setBounds(300,0,300,25);
        add(text);
        
        lb1username = new JLabel("Username :");
        lb1username.setBounds(30, 50, 150, 25);
        add(lb1username);
        
        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);
        
        lblId = new JLabel("ID :");
        lblId.setBounds(30, 90, 150, 25);
	add(lblId);
        
        tfid = new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);
        
        lbnumber = new JLabel("NUMBER :");
        lbnumber.setBounds(30, 130, 150, 25);
	add(lbnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);
        
        lb1name = new JLabel("Name :");
        lb1name.setBounds(30, 170, 150, 25);
        add(lb1name);
        
        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);
        
        lbgender = new JLabel("Gender :");
        lbgender.setBounds(30, 210, 150, 25);
        add(lbgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);
        
        lblCountry = new JLabel("Country :");
	lblCountry.setBounds(30, 250, 150, 25);
	add(lblCountry);
         
//        combocountry= new JComboBox(new String[] {"India", "Pakisthan", "China", "Bangladesh","Sri-Lanka","Nepal"});
//        combocountry.setBounds(220, 250, 150, 25);
//	add(combocountry);
        
        t3country = new JTextField();
	t3country.setBounds(220, 250, 150, 25);
	add(t3country);
	t3country.setColumns(10);
        
        lblAddress = new JLabel("Permanent Address :");
	lblAddress.setBounds(30, 290, 150, 25);
	add(lblAddress);
                
        t3Address = new JTextField();
	t3Address.setBounds(220, 290, 150, 25);
	add(t3Address);
	//t3Address.setColumns(10);
        
        lblphone = new JLabel("Phone :");
	lblphone.setBounds(30, 330, 150, 25);
	add(lblphone);
                
        t3phone = new JTextField();
	t3phone.setBounds(220, 330, 150, 25);
	add(t3phone);
	//t3phone.setColumns(10);
        
        lblEmail = new JLabel("Email :");
	lblEmail.setBounds(30, 370, 150, 25);
	add(lblEmail);
                
        t3Email = new JTextField();
	t3Email.setBounds(220, 370, 150, 25);
	add(t3Email);
	//t3Email.setColumns(10);
	
        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(70,430,100,50);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,50);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/update.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450,100,300,300);
        add(l1); 
        
        try{
            kite k = new kite();
            ResultSet rs = k.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                t3country.setText(rs.getString("country"));
                t3Address.setText(rs.getString("address"));
                t3phone.setText(rs.getString("phone"));
                t3Email.setText(rs.getString("email"));
            }        
        }catch(Exception e){           //becuse database is a external entity so error ane ke chances rhte h
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == update){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = t3country.getText();
            String address = t3Address.getText();
            String phone= t3phone.getText();
            String email = t3Email.getText();
           
            try{
                kite k = new kite();
                String query = "update customer set username= '"+username+"',id= '"+id+"',number= '"+number+"',name= '"+name+"',gender= '"+gender+"',country= '"+country+"',address= '"+address+"',phone= '"+phone+"',email= '"+email+"'";
                k.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Your Detail Updated Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new updatepersonaldetail("");
    }
}
