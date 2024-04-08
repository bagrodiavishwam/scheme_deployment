import java.sql.*;
import javax.swing.*;
public class MySQLConnection {
	public static Connection connectDB()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs_project", "root", "root@123");
			JOptionPane.showMessageDialog(null, "Connection made!");
			return con;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Connection error!");
			return null;
		}
	  }

}
