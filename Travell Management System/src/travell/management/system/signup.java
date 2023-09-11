package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
 

public class signup extends JFrame implements ActionListener{
    
    int CHUCHU = 2584;
    JButton create,back,otp,verify;
    JTextField tf1,tf2,tf3,tfanswer,tfphonenumber,tfOTP;
   // Choice security;
    JLabel lb1username,lb2name,lb3password,lb4security,lb5Answer,OTP;
    JPanel p1;
    
    signup(){
        setBounds(300,200,750,300);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,400,350);
        p1.setLayout(null);
        add(p1);
        
        lb1username = new JLabel("USERNAME :-");
        lb1username.setFont(new Font("Tahoma",Font.BOLD,14));
        lb1username.setBounds(50,20,125,25);
        p1.add(lb1username);
        
        tf1 = new JTextField();
        tf1.setBounds(170,23,160,20);
        tf1.setBorder(BorderFactory.createEmptyBorder());
        add(tf1);
        
        lb2name = new JLabel("NAME :-");
        lb2name.setFont(new Font("Tahoma",Font.BOLD,14));
        lb2name.setBounds(50,50,125,25);
        p1.add(lb2name);
        
        tf2 = new JTextField();
        tf2.setBounds(170,53,160,20);
        tf2.setBorder(BorderFactory.createEmptyBorder());
        add(tf2);
        
        lb3password= new JLabel("PASSWORD :-");
        lb3password.setFont(new Font("Tahoma",Font.BOLD,14));
        lb3password.setBounds(50,80,125,25);
        p1.add(lb3password);
        
        tf3 = new JTextField();
        tf3.setBounds(170,83,160,20);
        tf3.setBorder(BorderFactory.createEmptyBorder());
        add(tf3);
        
        lb4security = new JLabel("Phone no.:-");
        lb4security.setFont(new Font("Tahoma",Font.BOLD,14));
        lb4security.setBounds(50,110,125,25);
        p1.add(lb4security);
        
        tfphonenumber = new JTextField();
        tfphonenumber.setBounds(170,113,160,20);
        tfphonenumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfphonenumber);
        
//        security = new Choice();
//        security.add("what is your pet name ?");
//        security.add("Who is your date of birth ?");
//        security.add("what is lucky number");
//        security.setBounds(170,113,160,20);
//        p1.add(security);
        
//        lb5Answer= new JLabel("Answer:-");
//        lb5Answer.setFont(new Font("Tahoma",Font.BOLD,14));
//        lb5Answer.setBounds(50,140,125,25);
//        p1.add(lb5Answer);
//        
//        tfanswer = new JTextField();
//        tfanswer.setBounds(170,143,160,20);
//        tfanswer.setBorder(BorderFactory.createEmptyBorder());
//        add(tfanswer);
        
        otp = new JButton("Send OTP");
       // create.setBackground(new Color(133,193,233));
        otp.setForeground(new Color(133,193,233));
        otp.setBounds(240,140,90,25);
        otp.addActionListener(this);
        p1.add(otp);
        
        create = new JButton("CREATE");
       // create.setBackground(new Color(133,193,233));
        create.setForeground(new Color(133,193,233));
        create.setBounds(50,230,125,25);
        create.addActionListener(this);
        p1.add(create);
           
        OTP = new JLabel("OTP :-");
        OTP.setFont(new Font("Tahoma",Font.BOLD,14));
        OTP.setBounds(50,165,125,25);
        p1.add(OTP);
        
        tfOTP = new JTextField();
        tfOTP.setBounds(170,168,160,20);
        tfOTP.setBorder(BorderFactory.createEmptyBorder());
        add(tfOTP);

        verify = new JButton("VERIFY");
       // create.setBackground(new Color(133,193,233));
        verify.setForeground(new Color(133,193,233));
        verify.setBounds(240,193,90,25);
        verify.addActionListener(this);
        p1.add(verify);
        
        back = new JButton("BACK");
       // create.setBackground(new Color(133,193,233));
        back.setForeground(new Color(133,193,233));
        back.setBounds(200,230,125,25);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(450,30,200,200);
        add(l1);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
          String username = tf1.getText();
          String name = tf2.getText();
          String Password = tf3.getText();
          String phone =  tfphonenumber.getText();
         // String Answer = tfanswer.getText();
          
          String query = "insert into account value('"+username+"' , '"+name+"' , '"+Password+"' , '"+phone+"')";
          try{
             kite k = new kite(); 
             k.s.executeUpdate(query);
             
          // for show popup message
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
          
          setVisible(false);
          new Login();
          }catch(Exception e){
              e.printStackTrace();
          }
        }else if(ae.getSource() == back){
           setVisible(false);
           new Login();
       }else if(ae.getSource() == otp){
      
           try {
			// Construct data
			String apiKey = "apikey=" + "NDQ0ODQ4N2E2MTQ4NGM2ZjQyNjI1NDc4NTc1MzUxNGY";
                        Random rod = new Random();
                        CHUCHU = rod.nextInt(999999);
                        String name = tf1.getText();
			String message = "&message=" + "Hey "+ name +"your otp is "+ CHUCHU;
			String sender = "&sender=" + "MASTER";
			String numbers = tfphonenumber.getText();
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender ;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			JOptionPane.showConfirmDialog(null,"OTP send successfully");
			//return stringBuffer.toString();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error SMS "+e);
			//return "Error "+e;
                        JOptionPane.showMessageDialog(null,"error "+e);
		}
       }else if(ae.getSource() == verify){
           if(Integer.parseInt(tfOTP.getText())== CHUCHU){
               JOptionPane.showMessageDialog(null,"OTP is Correct ");
           }else{
               JOptionPane.showMessageDialog(null,"OTP is Correct ");
           }
       }
        
    }
      public static void main(String args[]){
         new signup(); 
      }
}
