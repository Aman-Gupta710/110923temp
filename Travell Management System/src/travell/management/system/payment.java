package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener{
    
    JButton jbback,jbpay,jbpayqr;
    
     payment(){
         setBounds(300,50,800,600);
         setLayout(null);
         
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/paytm.jpeg"));
       Image i3 = i1.getImage().getScaledInstance(800, 600,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(0,0,800,600);
       add(l1); 
       
       jbback = new JButton("Back");
       //jbback.setBackground(Color.ORANGE);
       jbback.setForeground(Color.BLACK);
       jbback.setBounds(40, 10, 100, 25);
       jbback.addActionListener(this);
       l1.add(jbback);
       
       jbpayqr = new JButton("Pay via QR");
       //jbpayqr.setBackground(Color.ORANGE);
       jbpayqr.setForeground(Color.BLACK);
       jbpayqr.setBounds(350, 10, 100, 25);
       jbpayqr.addActionListener(this);
       l1.add(jbpayqr);
       
       jbpay = new JButton("Pay");
       //jbpay.setBackground(Color.ORANGE);
       jbpay.setForeground(Color.BLACK);
       jbpay.setBounds(600, 10, 100, 25);
       jbpay.addActionListener(this);
       l1.add(jbpay);
      
         setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == jbpay){
             setVisible(false);
               new paytm();
         }else if(ae.getSource() == jbpayqr){
             setVisible(false);
               new QR();
         }else {
             setVisible(false);
         }
     }
     public static void main(String args[]){
          new payment();   
     }    
}
