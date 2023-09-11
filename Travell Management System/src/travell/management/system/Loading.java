package travell.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    Thread t;  //here "t" is a classs
    
    JLabel lb1,loading,uname;
    JProgressBar bar ;
    
    String username;
    
    public void run(){
       try{
           for(int i=1;i<=101;i++){
               int max = bar.getMaximum();
               int value = bar.getValue();
               
               if(value < max){
                   bar.setValue(bar.getValue() + 1);                   
               }else{
                   setVisible(false);
                   new Dashboard(username);
                   //new class object;
               }
               Thread.sleep(50);
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    
    
    
    Loading(String username){
        this.username = username;
        t = new Thread(this);
        
        setBounds(400,150,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        lb1 = new JLabel("Travel And Tourism Management");
        lb1.setBounds(50,20,600,40); 
        lb1.setForeground(Color.red);
        lb1.setFont(new Font("Raleway",Font.BOLD,35));
        add(lb1);
        
        loading = new JLabel("Loading, please wait...");
        loading.setBounds(240,130,200,40);
        loading.setForeground(Color.BLUE);
        loading.setFont(new Font("Raleway",Font.BOLD,13));
        add(loading);
        
        uname = new JLabel("Welcome " + username);
        uname.setBounds(20,310,400,40);
        uname.setForeground(Color.ORANGE);
        uname.setFont(new Font("Raleway",Font.BOLD,16));
        add(uname);
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);  // this we use hear to show the 0% starting of loading
        add(bar);
        
        t.start();
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        new Loading("");
    }
}
