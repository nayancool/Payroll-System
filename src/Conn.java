import java.sql.*;

public class Conn {
    
    public Connection c;//for connection between database and java application 
    public Statement s;//Use for execute query
    
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//register all driver of mysql
            c=DriverManager.getConnection("jdbc:mysql:///Payroll","root","");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
