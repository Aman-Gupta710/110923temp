package travell.management.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class checkPackages extends JFrame{
    public static void main(String[] args) {
      new checkPackages().setVisible(true);
    }

    checkPackages() {    
      setBounds(300, 120, 900, 600);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","GOLD PACKAGE","Welcome drinks on Arrival","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour","Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000/- only"};
      String[] package2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000/- only"};
      String[] package3 = new String[]{"package3.jpg","platinum PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Helicopter Ride", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000/- only"};
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      tabbedPane.addTab("Package 3", null, p3);
      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400,0,450,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(50, 5, 350, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setBounds(35, 70, 200, 14);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.ORANGE);
        lblId.setBounds(35, 110, 200, 14);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setBounds(35, 150, 200, 14);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.ORANGE);
        lblName_1.setBounds(35, 190, 200, 14);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(35, 230, 200, 14);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.ORANGE);
        lblCountry.setBounds(35, 270, 200, 14);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(35, 310, 200, 14);
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.ORANGE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.MAGENTA);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);
        
        return p1;
    }
}

//package travell.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//
//
//public class checkPackages extends JFrame{
//    checkPackages(){
//        setBounds(250,100,900,600);
//        
//        JTabbedPane tab = new JTabbedPane();
//        
//        JPanel p1 = createPackage();
//        tab.addTab("Package 1", null, p1);
//         
//        JPanel p2 = createPackage();
//        tab.addTab("Package 1", null, p2);
//        
//        JPanel p3 = createPackage();
//        tab.addTab("Package 1", null, p3);
//        add(tab);
//       
//        
//        setVisible(true);
//    }
//    public JPanel createPackage(){
//        JPanel p1 = new JPanel();
//        p1.setLayout(null);
//        p1.setBackground(Color.WHITE);
//        
//        JLabel l1 = new JLabel("GOLD PACKAGE");
//        l1.setBounds(100,5,300,30);
//        l1.setForeground(Color.YELLOW);
//        l1.setFont(new Font("Tahoma",Font.BOLD,30));
//        p1.add(l1);
//        
//        JLabel l2 = new JLabel(" 1. Welcome Drink On Arrival");
//        l2.setBounds(30,60,300,30);
//        l2.setForeground(Color.RED);
//        l2.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l2);
//        
//        JLabel l3 = new JLabel(" 2. 6 Days and 7 Nights");
//        l3.setBounds(30,115,300,30);
//        l3.setForeground(Color.ORANGE);
//        l3.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l3);
//        
//        JLabel l4 = new JLabel(" 3. Both Side Filght Tickets");
//        l4.setBounds(30,170,300,30);
//        l4.setForeground(Color.RED);
//        l4.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l4);
//        
//        JLabel l5 = new JLabel(" 4. Half Day City Tour");
//        l5.setBounds(30,225,300,30);
//        l5.setForeground(Color.ORANGE);
//        l5.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l5);
//        
//        JLabel l6 = new JLabel(" 5. Daily Buffet");
//        l6.setBounds(30,280,300,30);
//        l6.setForeground(Color.RED);
//        l6.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l6);
//        
//        JLabel l7 = new JLabel(" 6. personal Tour Guide");
//        l7.setBounds(30,335,300,30);
//        l7.setForeground(Color.ORANGE);
//        l7.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l7);
//        
//        JLabel l8 = new JLabel("Book Now");
//        l8.setBounds(60,400,300,30);
//        l8.setForeground(Color.BLUE);
//        l8.setFont(new Font("Tahoma",Font.BOLD,25));
//        p1.add(l8);
//        
//        JLabel l9 = new JLabel(" Price :- Rs.12000/");
//        l9.setBounds(500,400,300,30);
//        l9.setForeground(Color.BLACK);
//        l9.setFont(new Font("Tahoma",Font.BOLD,20));
//        p1.add(l9);
//        
//        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/package1.jpg"));
//        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
//        ImageIcon i2 = new ImageIcon(i3);
//        JLabel le = new JLabel(i2);
//        le.setBounds(350,20,500,300);
//        p1.add(le);
//        
//        return p1;
//    }
//    
//    public static void main(String args[]){
//      new checkPackages();  
//    }   
//}
