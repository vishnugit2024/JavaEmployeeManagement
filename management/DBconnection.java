package sys.management;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
	static Connection con;
    public static Connection createDBConnetion()throws Exception
   
   {
	   String url = "jdbc:mysql://localhost:3306/weekday11";
	   String user = "root";
	   String pass = "installer";
	   Class.forName("com.mysql.cj.jdbc.Driver");
	  con = DriverManager.getConnection(url,user,pass);
	   
	   return con;
	   
   }
}
