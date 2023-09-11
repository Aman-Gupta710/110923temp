package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
   JButton b1,b2;
   String username; 
   Rules(String username){
       this.username = username;
        setBounds(300,80,800,520);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 =  new JLabel("# Welcome " + username + " to Mind Test Assesment");
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD, 25));
        l1.setForeground(new Color(30,144,254));
        l1.setBounds(50,5,700,35);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma",Font.PLAIN, 16));
        l2.setForeground(Color.BLACK);
        l2.setBounds(30,60,700,355);
        l2.setText(
             "<html>"+
                " Listen carefully to instructions."+"<br><br>" +
                " As you enter show your Student ID card."+"<br><br>" +
                " Make sure your mobile phone is switched off."+"<br><br>" +
                " Each Question have Equal Time of 15 seconds."+"<br><br>" +
                " Remember that talking is not allowed during Exam time."+"<br><br>" +
                " Each question contain equal marks."+"<br><br>" +     
                " Don't Look Here and there during exam."+"<br><br>" +     
                " Place your Student ID card on your desk next to your attendance card."+"<br><br>" +
                " Keep your eyes on your own paper. Remember, copying is cheating! Not Allowed."+"<br><br>" +
                " Stop writing immediately when the teacher says it is the end of the exam."+"<br><br>" +     
             "<html>");
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(50,430,100,25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("START");
        b2.setBounds(600,430,100,25);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
            
       setVisible(true);
   }   
   
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
           setVisible(false);
            new SimpleMind().setVisible(true);
        }else{
            setVisible(false);
            new Start(username).setVisible(true);
        }
    
    }
   
   public static void main(String[] args){
       new Rules("");
   }
}
