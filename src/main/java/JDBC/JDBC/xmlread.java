package JDBC.JDBC;

import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;  
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class xmlread {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("C:\\JDBC\\src\\main\\java\\JDBC\\JDBC\\employee12.xml");
			DocumentBuilderFactory d =  DocumentBuilderFactory.newInstance();
			DocumentBuilder d1= d.newDocumentBuilder();
			Document d2 = d1.parse(f);
			d2.getDocumentElement().normalize();
			System.out.println("Root element "+d2.getDocumentElement().getNodeName());
			NodeList n = d2.getElementsByTagName("employee");
			for(int i=0;i<n.getLength();i++)
			{
				Node n1 = n.item(i);
				System.out.println("\n Node Name "+n1.getNodeName());
				if(n1.getNodeType()==Node.ELEMENT_NODE)
				{
					Element e =(Element)n1;
					
						System.out.println("Employee name: "+ e.getElementsByTagName("name").item(0).getTextContent());
						System.out.println("Employee designation: "+ e.getElementsByTagName("designation").item(0).getTextContent());
						System.out.println("Employee empid: "+ e.getElementsByTagName("Empid").item(0).getTextContent());
						System.out.println("Employee sal: "+ e.getElementsByTagName("salary").item(0).getTextContent());
					
				}
			}
			
			
		}
	catch(Exception e)
		{
		e.printStackTrace(); 
		}
		

	}

}
