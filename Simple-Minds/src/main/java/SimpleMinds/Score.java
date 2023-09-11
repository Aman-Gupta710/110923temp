package SimpleMinds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
     JButton b1,b2;
    String username;
     Score(String username, int score){
         setBounds(350,100,750,550);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("SimpleMinds/icons/score.png"));
//        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l1 = new JLabel(i3);
//        l1.setBounds(0, 200, 300, 250);
//        add(l1);

        JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is  " + score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        b1 = new JButton(" Play Again ");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(400, 270, 120, 30);
        add(b1);
        
        b2 = new JButton(" Exit ");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        
        b2.setBounds(400, 310, 120, 30);
        add(b2);
    }
     
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
          this.setVisible(false);
        new SimpleMind().setVisible(true);
        }else{
            System.exit(0);
        }
    }
     public static void main(String ars[]){
         new Score("", 0).setVisible(true);
     }
}
