package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paytm extends JFrame implements ActionListener{
    JButton jbback;
    paytm(){
        setBounds(300,50,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
         try{
             pane.setPage("https://paytm.com/rent-payment");
         }catch(Exception e){
             pane.setContentType("text/html");
             pane.setText("<html>Could not Load,Error 404</html>");
         }
         
         JScrollPane sp = new JScrollPane(pane);
         getContentPane().add(sp);
         
        jbback = new JButton("Back");
        jbback.setBackground(Color.ORANGE);
        jbback.setForeground(Color.BLACK);
        jbback.setBounds(610, 300, 80, 40);
        jbback.addActionListener(this);
        pane.add(jbback);
         
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new payment();
    }
    
    public static void main(String args[]){
        new paytm();
    }
}
