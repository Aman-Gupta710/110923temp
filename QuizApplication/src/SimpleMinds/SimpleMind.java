package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      

public class SimpleMind extends JFrame implements ActionListener {
    
    JButton b1,b2;
    JTextField t1;
    SimpleMind(){
        setBounds(100,100,1200,500); //length or fir height
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpeg"));
        JLabel l1 = new JLabel(icon);
        l1.setBounds(0,0,600,500);
        add(l1);
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")); 
//        JLabel l1 = new JLabel(i1);
//        l1.setBounds(0,0,1440,392);
//        add(l1);

        
        JLabel l2 = new JLabel("Simple minds");
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        l2.setForeground(new Color(30,144,254));
        l2.setBounds(750,40,300,45);
        add(l2);
        
        JLabel l3 = new JLabel("ENTER YOUR NAME ");
        l3.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        l3.setForeground(Color.BLACK);
        l3.setBounds(800,130,300,20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(750,160, 300, 23);
        t1.setFont(new Font("Times New Roman",Font.BOLD, 17));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(750,220,150,25);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("EXIT");
        b2.setBounds(950,220,150,25);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    
    }
    
   public static void main(String[] args){
     new SimpleMind();  
   }    
           
}
