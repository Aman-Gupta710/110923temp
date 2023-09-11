//vinaykumar15392@gmail.com
package emailsender;

import  com.email.durgesh.Email;

public class EmailSender {
    public static void main(String[] args){
        try{
            Email email = new Email("justagupta710@gmail.com","221626");
            //from
            email.setFrom("justagupta710@gmail.com","AmanTechSoft India");
            
            email.setSubject("this email for is for testing");
            
            email.setContent("<h1>This is content</h1>","text/html");
            
            email.addRecipient("vinaykumar15392@gmail.com");
            
            email.send();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

