package JDBC.JDBC;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class A3 {

	public static void main(String[] args) throws Exception {
		
		
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Trax", "postgres", "rampandu");
		Statement s = c.createStatement();
		File f = new File("C:\\JDBC\\src\\main\\java\\JDBC\\JDBC\\Employee3.xml");
		JAXBContext r = JAXBContext.newInstance(A2.class);
		Unmarshaller u = r.createUnmarshaller();
		A2 a = (A2) u.unmarshal(f);
		List <A1> employeeList = a.getA1List();
		for(A1 emp :employeeList)
		{
			System.out.println(emp.toString());
			Class<?> z = A1.class;
			StringBuilder q = new StringBuilder();
			q.append("insert into employee3(");
			for(Field f1: z.getDeclaredFields())
			{
				f1.setAccessible(true);
				q.append(f1.getName()).append(",");
			}
			q.deleteCharAt(q.length() - 1);
			q.append(")VALUES(");
			for (Field field : z.getDeclaredFields()) {
			field.setAccessible(true);
			q.append("'").append(field.get(emp)).append("'").append(",");
			}
			q.deleteCharAt(q.length()-1);
			q.append(");");
			System.out.println(q);
			PreparedStatement preparedStatement = c.prepareStatement(q.toString());
			preparedStatement.executeUpdate();
		}
		 
	}

}
