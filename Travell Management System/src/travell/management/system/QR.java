package travell.management.system;
import javax.swing.*;
import java.awt.*;

public class QR extends JFrame {
    QR(){
        
       setBounds(550,70,400,650);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE); 
        
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/qr.jpeg"));
       Image i3 = i1.getImage().getScaledInstance(400, 600,Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(i3);
       JLabel l1 = new JLabel(i2);
       l1.setBounds(0,0,400,600);
       add(l1);
       
       setVisible(true);
    }
    public static void main(String args[]){
         new QR();   
    }
}
