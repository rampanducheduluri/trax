package JDBC.JDBC;
 // import java.awt.Taskbar.State;
import java.sql.*;

public class update_operation {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// package JDBC.JDBC;
		


		
			  
			 String url = "jdbc:postgresql://localhost:5432/Trax";
			 String username = "postgres";
			 String password = "rampandu";
			 Class.forName("org.postgresql.Driver");
			 Connection c = DriverManager.getConnection(url,username,password);
			 Statement s = c.createStatement();
			 String query1 = "update employee1 set empname = 'ram' where empid =1381 ";
			 int a = s.executeUpdate(query1);
			 System.out.println("Sucessfully updated");
			 c.close();
			  
			  
		 
		  
		

	}

}
