package JDBC.JDBC;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class xmltojdbc {

	public static void main(String[] args) {
	
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Trax", "postgres", "rampandu");
			Statement st=con.createStatement();


			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse (new File("C:\\JDBC\\src\\main\\java\\JDBC\\JDBC\\employee12.xml"));
			doc.getDocumentElement().normalize();
			System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());


			NodeList nodeList = doc.getElementsByTagName("employee");
			for (int itr = 0; itr < nodeList.getLength(); itr++)  
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());   
			if (node.getNodeType() == Node.ELEMENT_NODE)  
			{  
			Element eElement = (Element) node;    
			String name  = eElement.getElementsByTagName("name").item(0).getTextContent();  
			String designation =  eElement.getElementsByTagName("designation").item(0).getTextContent(); 
			String empid =  eElement.getElementsByTagName("empid").item(0).getTextContent(); 
			String salary =  eElement.getElementsByTagName("salary").item(0).getTextContent(); 
			
			int r=st.executeUpdate("insert into public.employee12(name,empid,salary,designation) values('"+name+"','"+empid+"','"+salary+".v ','"+designation+"')");
			}
			}
			System.out.println("Data is successfully inserted!");
			}
			catch (Exception e)  
			{  
			e.printStackTrace();  
			}
			}


	}
