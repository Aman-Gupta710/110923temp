package travell.management.system;
import java.sql.*;

public class kite {
    
   Connection c;
   Statement s;
    kite(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","root");
            s = c.createStatement();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
