package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class forgetpass extends JFrame{
    
    JPanel p1;
    JLabel l1,lbphone;
    JTextField tfphone;
    
    forgetpass(){
        setBounds(300,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/forgotpassword.jpg"));
        Image i2  = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(580,70,200,200);
        add(l1);   
        
        lbphone = new JLabel("Phone no.");
        lbphone.setBounds(40,20,100,25);
        lbphone.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(170,50,160,20);
        tfphone.setBorder(BorderFactory.createEmptyBorder());
        add(tfphone);
        
        
        setVisible(true);
    }
    
    
    
    
     public static void main(String args[]){
         new forgetpass();
     }
}
