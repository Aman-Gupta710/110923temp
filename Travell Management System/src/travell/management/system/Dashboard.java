package travell.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    JPanel p1,p2,p3;
    JLabel icon,heading,image,HEAD;
    JButton addpersonaldetail,UpdatePersonalDetail,Payment,Destination,Calculator,NotePad,ViewBookedHotels,SendFeedback,ViewDetail,BookHotel,Deletepersonaldetail,CheckPackage,ViewHotels,BookPackage,ViewPackage, ABOUT;
    String username;
   // String username;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);    //this is for to setframe to whole screen
        setLayout(null);
        
        //upper panel
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.YELLOW);
        p1.setBounds(0,0,1600,35);
        add(p1);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/deklogo.png"));
        Image i2 = i1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        icon = new JLabel(i3);
        icon.setBounds(5,0,40,40);
        p1.add(icon);
        
        heading = new JLabel("Hi");
        heading.setBounds(50,1,300,40);
        heading.setForeground(Color.RED);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(heading);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.YELLOW);
        p2.setBounds(0,30,250,900);
        add(p2);
        
        addpersonaldetail = new JButton("Add Personal Detail");
        addpersonaldetail.setBounds(0,5,250,40);
        addpersonaldetail.setBackground(new Color(0,0,102));
        addpersonaldetail.setForeground(Color.WHITE);
        addpersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,15));
        addpersonaldetail.setMargin(new Insets(0,0,0,100));
        addpersonaldetail.addActionListener(this);
        p2.add(addpersonaldetail);
        
        UpdatePersonalDetail = new JButton("Update Personal Detail");
        UpdatePersonalDetail.setBounds(0,40,250,40);
        UpdatePersonalDetail.setBackground(new Color(0,0,102));
        UpdatePersonalDetail.setForeground(Color.WHITE);
        UpdatePersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,15));
        UpdatePersonalDetail.setMargin(new Insets(0,0,0,70));
        UpdatePersonalDetail.addActionListener(this);
        p2.add(UpdatePersonalDetail);
        
        ViewDetail = new JButton("View Detail");
        ViewDetail.setBounds(0,80,250,40);
        ViewDetail.setBackground(new Color(0,0,102));
        ViewDetail.setForeground(Color.WHITE);
        ViewDetail.setFont(new Font("Tahoma",Font.PLAIN,15));
        ViewDetail.setMargin(new Insets(0,0,0,80));
        ViewDetail.addActionListener(this);
        p2.add(ViewDetail);
        
        Deletepersonaldetail = new JButton("Delete Personal Detail");
        Deletepersonaldetail.setBounds(0,120,250,40);
        Deletepersonaldetail.setBackground(new Color(0,0,102));
        Deletepersonaldetail.setForeground(Color.WHITE);
        Deletepersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,15));
        Deletepersonaldetail.setMargin(new Insets(0,0,0,100));
        Deletepersonaldetail.addActionListener(this);
        p2.add(Deletepersonaldetail);
        
        CheckPackage = new JButton("Check Package");
        CheckPackage.setBounds(0,160,250,40);
        CheckPackage.setBackground(new Color(0,0,102));
        CheckPackage.setForeground(Color.WHITE);
        CheckPackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        CheckPackage.setMargin(new Insets(0,0,0,100));
        CheckPackage.addActionListener(this);
        p2.add(CheckPackage);
        
        BookPackage = new JButton("Book Package");
        BookPackage.setBounds(0,200,250,40);
        BookPackage.setBackground(new Color(0,0,102));
        BookPackage.setForeground(Color.WHITE);
        BookPackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        BookPackage.setMargin(new Insets(0,0,0,100));
        BookPackage.addActionListener(this);
        p2.add(BookPackage);
        
        ViewPackage = new JButton("View Package");
        ViewPackage.setBounds(0,240,250,40);
        ViewPackage.setBackground(new Color(0,0,102));
        ViewPackage.setForeground(Color.WHITE);
        ViewPackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        ViewPackage.setMargin(new Insets(0,0,0,100));
        ViewPackage.addActionListener(this);
        p2.add(ViewPackage);
        
        ViewHotels = new JButton("View Hotels");
        ViewHotels.setBounds(0,280,250,40);
        ViewHotels.setBackground(new Color(0,0,102));
        ViewHotels.setForeground(Color.WHITE);
        ViewHotels.setFont(new Font("Tahoma",Font.PLAIN,15));
        ViewHotels.setMargin(new Insets(0,0,0,100));
        ViewHotels.addActionListener(this);
        p2.add(ViewHotels);
        
        BookHotel = new JButton("Book Hotel");
        BookHotel.setBounds(0,320,250,40);
        BookHotel.setBackground(new Color(0,0,102));
        BookHotel.setForeground(Color.WHITE);
        BookHotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        BookHotel.setMargin(new Insets(0,0,0,100));
        BookHotel.addActionListener(this);
        p2.add(BookHotel);
        
        ViewBookedHotels = new JButton("View Booked Hotels");
        ViewBookedHotels.setBounds(0,360,250,40);
        ViewBookedHotels.setBackground(new Color(0,0,102));
        ViewBookedHotels.setForeground(Color.WHITE);
        ViewBookedHotels.setFont(new Font("Tahoma",Font.PLAIN,15));
        ViewBookedHotels.setMargin(new Insets(0,0,0,100));
        ViewBookedHotels.addActionListener(this);
        p2.add(ViewBookedHotels);
        
        Destination = new JButton("Destination");
        Destination.setBounds(0,400,250,40);
        Destination.setBackground(new Color(0,0,102));
        Destination.setForeground(Color.WHITE);
        Destination.setFont(new Font("Tahoma",Font.PLAIN,15));
        Destination.setMargin(new Insets(0,0,0,100));
        Destination.addActionListener(this);
        p2.add(Destination);
        
        Payment = new JButton("Payment");
        Payment.setBounds(0,440,250,40);
        Payment.setBackground(new Color(0,0,102));
        Payment.setForeground(Color.WHITE);
        Payment.setFont(new Font("Tahoma",Font.PLAIN,15));
        Payment.setMargin(new Insets(0,0,0,100));
        Payment.addActionListener(this);
        p2.add(Payment);
        
        NotePad = new JButton("NotePad");
        NotePad.setBounds(0,480,250,40);
        NotePad.setBackground(new Color(0,0,102));
        NotePad.setForeground(Color.WHITE);
        NotePad.setFont(new Font("Tahoma",Font.PLAIN,15));
        NotePad.setMargin(new Insets(0,0,0,100));
        NotePad.addActionListener(this);
        p2.add(NotePad);
        
        Calculator = new JButton("Calculator");
        Calculator.setBounds(0,520,250,40);
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma",Font.PLAIN,15));
        Calculator.setMargin(new Insets(0,0,0,100));
        Calculator.addActionListener(this);
        p2.add(Calculator);
        
        ABOUT = new JButton("ABOUT:-");
        ABOUT.setBounds(0,560,250,40);
        ABOUT.setBackground(new Color(0,0,102));
        ABOUT.setForeground(Color.WHITE);
        ABOUT.setFont(new Font("Tahoma",Font.PLAIN,15));
        ABOUT.setMargin(new Insets(0,0,0,100));
        ABOUT.addActionListener(this);
        p2.add( ABOUT);
        
        SendFeedback = new JButton("Send Feedback");
        SendFeedback.setBounds(0,600,250,40);
        SendFeedback.setBackground(new Color(0,0,102));
        SendFeedback.setForeground(Color.WHITE);
        SendFeedback.setFont(new Font("Tahoma",Font.PLAIN,15));
        SendFeedback.setMargin(new Insets(0,0,0,100));
        SendFeedback.addActionListener(this);
        p2.add(SendFeedback);
          
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("travell/management/system/icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel HEAD = new JLabel("Travel & Tour Management System");
        HEAD.setBounds(430,70,1200,70);
        HEAD.setForeground(Color.GREEN);
        HEAD.setFont(new Font("Serif",Font.ITALIC,55));
        image.add(HEAD);
        
        
        setVisible(true);        
    }  
    
    public void  actionPerformed(ActionEvent ae){
         if(ae.getSource()==addpersonaldetail){
             new AddCustomer(username);
         }else if(ae.getSource()==UpdatePersonalDetail){
             new updatepersonaldetail(username);
         }else if(ae.getSource()==Payment){
             new payment();
         }else if(ae.getSource()==Destination){
             new Destination();
         }else if(ae.getSource()==Calculator){
             try{
                 Runtime.getRuntime().exec("calc.exe");
             }catch(Exception e){
                 e.printStackTrace();
             }
         }else if(ae.getSource()==NotePad){
              try{
                 Runtime.getRuntime().exec("notepad.exe");
             }catch(Exception e){
                 e.printStackTrace();
             }
         }else if(ae.getSource()==ViewBookedHotels){
            new ViewBookedHotel(username);
         }else if(ae.getSource()==SendFeedback){
          
         }else if(ae.getSource()==ViewDetail){
            new viewcustomer(username);
         }else if(ae.getSource()==BookHotel){
            new BookHotel(username);
         }else if(ae.getSource()==Deletepersonaldetail){
            new DeleteDetail(username);
         }else if(ae.getSource()==CheckPackage){
            new checkPackages();
         }else if(ae.getSource()==ViewHotels){
            new CheckHotels();
         }else if(ae.getSource()==BookPackage){
            new BookPackages(username);
         }else if(ae.getSource()==ViewPackage){
            new viewpackage(username);
         }else if(ae.getSource()==ABOUT){
            new About();
         }
    }  
    public static void main(String args[]){
        new Dashboard("mamta123");
    }
}
