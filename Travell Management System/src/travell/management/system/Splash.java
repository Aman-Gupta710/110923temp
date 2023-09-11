package travell.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash {
    public static void main(String[] args){
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int c = 1;
        for(int i=1;i<=500; i+=4,c+=5){
           frame.setLocation(500 - c/2,550- (i));
           
           frame.setSize(c+i,i);
           try{
               Thread.sleep(10);
           }catch(Exception e){}
        }
        frame.setVisible(true);
    }
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/splash.jpg"));
        Image i2  = i1.getImage().getScaledInstance(1200, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);    
        
        //this is for removing upper tab of frame;
        setUndecorated(true);
        
        t1 =new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(10000);
            this.setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e){}
    }
}
