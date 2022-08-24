package JDBC.JDBC;
import java.awt.Taskbar.State;
import java.sql.*;


public class Insertoperation {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  
	 String url = "jdbc:postgresql://localhost:5432/Trax";;
	 String username = "postgres";
	 String password = "rampandu";
	 Class.forName("org.postgresql.Driver");
	 Connection c = DriverManager.getConnection(url,username,password);
	 Statement s = c.createStatement();
	 String query = "insert into public.employee1(empname,empsal,empid) values('ram',25000,1381)";
	 int r = s.executeUpdate(query);
	 System.out.println("Sucessfully updated");
	 String query1 = "update employee1 set empname = 'ram' where empid =1381 ";
	 int a = s.executeUpdate(query1);
	 c.close();
	  
	  
 
  }
}
