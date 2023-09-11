package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame implements ActionListener{
    
    JButton next,s,ll;
    public static int count = 0;
    public static int timer = 15;
    public static int ReTime = 0;
    public static int score = 0;
    JLabel qno,question;
    String q[][]= new String[10][5];
    String PA[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton op1,op2,op3,op4;
    ButtonGroup option;
   String username;
   
   Start(String username){
       this.username = username;
       
        setBounds(0,0,1440,800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")); 
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1440,392);
        add(l1);
              

        qno = new JLabel("");
        qno.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        qno.setForeground(Color.BLACK);
        qno.setBounds(130,420,50,40);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        question.setForeground(Color.BLACK);
        question.setBounds(150,420,900,40);
        add(question);
        
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        op1 = new JRadioButton("");
        op1.setBounds(175,460,500,40);
        op1.setBackground(Color.WHITE);
        add(op1);
        op2 = new JRadioButton("");
        op2.setBounds(175,500,500,40);
        op2.setBackground(Color.WHITE);
        add(op2);
        op3 = new JRadioButton("");
        op3.setBounds(175,540,500,40);
        op3.setBackground(Color.WHITE);
        add(op3);
        op4 = new JRadioButton("");
        op4.setBounds(175,580,500,40);
        op4.setBackground(Color.WHITE);
        add(op4);
        
        //hear we grouping all option in an object;
        option = new ButtonGroup();
        option.add(op1);
        option.add(op2);
        option.add(op3);
        option.add(op4);
        
        next = new JButton("next");
        next.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100,480,200,35);
        add(next);
        
        ll = new JButton("50-50");
        ll.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        ll.setBackground(new Color(30,144,255));
        ll.setForeground(Color.WHITE);
        ll.addActionListener(this);
        ll.setBounds(1100,520,200,35);
        add(ll);
        
        s = new JButton("SUBMIT");
        s.setFont(new Font("Mongolian Baiti",Font.BOLD, 15));
        s.setEnabled(false);
        s.setBackground(new Color(30,144,255));
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        s.setBounds(1100,560,200,35);
        add(s);
        
        dog(0);
   }   
   
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== next){                             ///next button all action at each question
           repaint();
           op1.setEnabled(true);
           op2.setEnabled(true);
           op3.setEnabled(true);
           op4.setEnabled(true);
           
           ReTime = 1;
           if(option.getSelection()==null){
              PA[count][0] = ""; 
           }else{
             PA[count][0]=option.getSelection().getActionCommand(); 
           }
           if(count==8){
              next.setEnabled(false);
              s.setEnabled(true);
          }
           count++;
           dog(count);
           
       }else if(ae.getSource()== s){                             /// SUBMIT button all actions and performanence at end question answer
           ReTime =  1;               
           if(option.getSelection()==null){
               PA[count][0] = "";
           }else{
               PA[count][0] = option.getSelection().getActionCommand();
           }
            for(int i=0;i < PA.length;i++){
                 if(PA[i][0].equals(qa[i][1])){
                     score+=10;
                 }else{
                     score+=0;
                 }
              }              
              this.setVisible(false);
              
       }else if(ae.getSource() == ll){                     //LIFE-LINE button all action and performance on life line button clicked
           if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
               op2.setEnabled(false);
               op3.setEnabled(true);
           }else{
               op1.setEnabled(false);
               op4.setEnabled(false);
           }
           ll.setEnabled(false);
       }
   }
   
   public void paint(Graphics g){
       super.paint(g);
      // System.out.println("Hello Worls");
       String time = "Time Left - " + timer +" seconds";
       g.setColor(Color.RED);
       g.setFont(new Font("Tahoma",Font.BOLD,20));
          if(timer >0){
              g.drawString(time ,1050,450); 
          }else{
              g.drawString("Times-up!!",1050 ,450);
          }
       timer--;
       
       try{
           repaint();
           Thread.sleep(1000);    // for a break of each one second;
       }catch(Exception e){
           e.printStackTrace();
       }
      if(ReTime==1){
          ReTime = 0;
          timer = 15;
      }else if(timer < 0){
          timer = 15;
           op1.setEnabled(true);
           op2.setEnabled(true);
           op3.setEnabled(true);
           op4.setEnabled(true);
          
          if(count==8){
              next.setEnabled(false);
              s.setEnabled(true);
          }
          if(count==9){
              if(option.getSelection()==null){
                PA[count][0] = ""; 
              }else{
                PA[count][0]=option.getSelection().getActionCommand(); 
              }
              
              for(int i=0;i < PA.length;i++){
                 if(PA[i][0].equals(qa[i][1])){
                     score+=10;
                 }else{
                     score+=0;
                 }
              }              
              this.setVisible(false);
              new Score(username, score).setVisible(true);
          }else{
            if(option.getSelection()==null){
              PA[count][0] = ""; 
           }else{
             PA[count][0]=option.getSelection().getActionCommand(); 
           }
           count++;
           dog(count);
          }
      }
   }
   public void dog(int count){
       qno.setText("" + (count +1) + ". ");
       question.setText(q[count][0]);
       op1.setLabel(q[count][1]);
       op1.setActionCommand(q[count][1]);
       op2.setLabel(q[count][2]);
       op2.setActionCommand(q[count][2]);
       op3.setLabel(q[count][3]);
       op3.setActionCommand(q[count][3]);
       op4.setLabel(q[count][4]);
       op4.setActionCommand(q[count][4]);
       option.clearSelection();
   }
   public static void main(String[] args){
       new Start("");
   }
}
