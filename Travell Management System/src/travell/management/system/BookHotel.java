package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel  extends JFrame implements ActionListener{
    JLabel text,lb1username,labelusername,lblPackage,lbperson,lblId,labelid,
            lbnumber,labelnumber,lblphone,labelphone,lbltotal,labelprice,lbdays,lbac,lbfood;
    
    JComboBox combodays,combonight;
    Choice choicehotel,comboac,combofood;
    JTextField tfpersons,tfdays;
    JButton checkprice,BookPack,Back;
 
    String username;
    BookHotel(String username){
        this.username = username;
       setBounds(200,100,1100,600);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       
       text = new JLabel("-:   BOOK HOTEL  :-");
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
       
       lblPackage = new JLabel("Select Hotel:");
       lblPackage.setBounds(40, 110, 200, 25);
       add(lblPackage);
       choicehotel = new Choice();
       choicehotel.setBounds(250,110,150,20);
       add(choicehotel);
       
       try{
           kite k = new kite();
           ResultSet rs = k.s.executeQuery("select * from hotel");
           while(rs.next()){
              choicehotel.add(rs.getString("name")); 
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       lbperson = new JLabel("Total Persons:");
       lbperson.setBounds(40, 150, 200, 25);
       add(lbperson);
       tfpersons = new JTextField();
       tfpersons.setBounds(250, 150, 150, 25);
       add(tfpersons);
       
       lbdays = new JLabel("No. of Days");
       lbdays.setBounds(40, 190, 200, 25);
       add(lbdays);
       tfdays = new JTextField();
       tfdays.setBounds(250, 190, 150, 25);
       add(tfdays);
       
       
//       combodays= new JComboBox(new String[] {"1 Day", "2 Days", "3 Days", "4 Days","5 Days","6 Days","7 Days","8 Days","9 Days","10 Days","11 Days","12 Days","13 Days","14 Days","15 Days","16 Days","17 Days","18 Days","19 Days","20 Days","21 Days","22 Days","23 Days","24 Days","25 Days","26 Days","27 Days","28 Days","29 Days","30 Days","1 Month"});
//       combodays.setBounds(250, 190, 100, 25);
//       add(combodays);
//       combonight= new JComboBox(new String[] {"1 night", "2 night", "3 night", "4 night","5 night","6 night","7 night","8 night","9 night","10 night","11 night","12 night","13 night","14 night","15 night","16 night","17 night","18 night","19 night","20 night","21 night","22 night","23 night","24 night","25 night","26 night","27 night","28 night","29 night","30 night","1 Month"});
//       combonight.setBounds(350, 190, 100, 25);
//       add(combonight);
       
       lbac = new JLabel("ac/Non-ac");
       lbac.setBounds(40, 230, 200, 25);
       add(lbac);
       comboac = new Choice();
       comboac.add("AC");
       comboac.add("NON-AC");
       comboac.setBounds(250, 230, 100, 25);
       add(comboac);
       
       lbfood = new JLabel("Food Included");
       lbfood.setBounds(40, 270, 200, 25);
       add(lbfood);
       combofood = new Choice();
       combofood.add("YES");
       combofood.add("NO");
       combofood.setBounds(250, 270, 100, 25);
       add(combofood);

       
       lblId = new JLabel("ID :");
       lblId.setBounds(40, 310, 150, 20);
       add(lblId);
       labelid = new JLabel();
       labelid.setBounds(250, 310,  200, 25);
       add(labelid);
       
       lbnumber = new JLabel("Number :");
       lbnumber.setBounds(40, 350, 150, 25);
       add(lbnumber);
       labelnumber = new JLabel();
       labelnumber.setBounds(250, 350, 150, 25);
       add(labelnumber);
       
       lblphone = new JLabel("Phone :");
       lblphone.setBounds(40, 390, 150, 20);
       add(lblphone);
       labelphone = new JLabel();
       labelphone.setBounds(250, 390, 200, 25);
       add(labelphone);
       
       lbltotal = new JLabel("Total price :");
       lbltotal.setBounds(40, 430, 200, 25);
       add(lbltotal);
       labelprice = new JLabel();
       labelprice.setBounds(250, 430, 150, 25);
       add(labelprice);
       
       checkprice = new JButton("Check-Prices");
       checkprice.setBounds(60,470,120,25);
       checkprice.setBackground(Color.YELLOW);
       checkprice.setForeground(Color.BLUE);
       checkprice.addActionListener(this);
       add(checkprice);
       
       BookPack = new JButton("Book-Hotel");
       BookPack.setBounds(200,470,120,25);
       BookPack.setBackground(Color.YELLOW);
       BookPack.setForeground(Color.BLUE);
       BookPack.addActionListener(this);
       add(BookPack);
       
       Back = new JButton("Back");
       Back.setBounds(340,470,120,25);
       Back.setBackground(Color.YELLOW);
       Back.setForeground(Color.BLUE);
       Back.addActionListener(this);
       add(Back);
       
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/book.jpg"));
       Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(550,50,500,500);
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
           try{
            kite k = new kite();
            ResultSet rs = k.s.executeQuery("select * from hotel where name = '"+choicehotel.getSelectedItem()+"'");
            while(rs.next()){
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int ac = Integer.parseInt(rs.getString("acroom"));
                int food = Integer.parseInt(rs.getString("fodincluded"));
                
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());
                
                String acselected = comboac.getSelectedItem();
                String foodselected = combofood.getSelectedItem();
                
                if(persons * days > 0){
                    int total = 0;
                    total += acselected.equals("AC") ? ac : 0;
                    total += foodselected.equals("YES") ? food : 0;
                    total +=cost;
                    total = total * persons * days;
                    labelprice.setText("Rs " +total+"/- only");
                }else{
                    JOptionPane.showMessageDialog(null,"Please Enter a Valid number");
                }
                
                
            }       
           }catch(Exception e){
               e.printStackTrace();
           } 
           
        }else if(ae.getSource() == BookPack){
            try{
                kite k = new kite();
                k.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+choicehotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+comboac.getSelectedItem()+"','"+combofood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Room Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
           setVisible(false);
        }
    }
    
    public static void main(String args[]){
       new BookHotel("");      
    }    
}
