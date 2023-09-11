package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame  implements ActionListener{
    
    JLabel lb1username,labelusername,lblId,lbnumber,lb1name,labelname,lbgender,lblCountry,lblAddress,lblphone,lblEmail; 
    JComboBox comboid,combocountry;
    JTextField tfnumber,t3country,t3Address,t3phone,t3Email;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    AddCustomer(String username){
        setBounds(350,100, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        lb1username = new JLabel("Username :");
        lb1username.setBounds(30, 50, 150, 25);
        add(lb1username);
        
        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);
        
        lblId = new JLabel("ID :");
        lblId.setBounds(30, 90, 150, 25);
	add(lblId);
        
        comboid= new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        comboid.setBounds(220, 90, 150, 25);
	add(comboid);
        
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
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
//        
        lblCountry = new JLabel("Country :");
	lblCountry.setBounds(30, 250, 150, 25);
	add(lblCountry);
         
        combocountry= new JComboBox(new String[] {"India", "Pakisthan", "China", "Bangladesh","Sri-Lanka","Nepal"});
        combocountry.setBounds(220, 250, 150, 25);
	add(combocountry);
        
//        t3country = new JTextField();
//	t3country.setBounds(220, 250, 150, 25);
//	add(t3country);
//	t3country.setColumns(10);
        
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
	
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,50);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,50);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/newcustomer.jpg"));
        Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450,40,450,420);
        add(l1); 
        
        try{                                
            kite k = new kite();
            ResultSet rs = k.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }        
        }catch(Exception e){           //becuse database is a external entity so error ane ke chances rhte h
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "male";
            }else{
                gender = "Female";
            }
            //String country = t3country.getText();
            String country = (String)combocountry.getSelectedItem();
            String address = t3Address.getText();
            String phone= t3phone.getText();
            String email = t3Email.getText();
           
            try{
                kite k = new kite();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                k.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new AddCustomer("");
    }
}
