package JDBC.JDBC;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class Assignment_1_3 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\JDBC\\src\\main\\java\\JDBC\\JDBC\\Assignment_1.xml");
			JAXBContext j = JAXBContext.newInstance(Assignment_1.class); 
			Unmarshaller  l = j.createUnmarshaller();
			Assignment_1 a = (Assignment_1) l.unmarshal(f);
			System.out.println(a.getDesignation()+" "+a.getEmpid()+" "+a.getEmpname()+" "+a.getSalary());
			
			
		}
		catch(JAXBException e)
		{
			e.printStackTrace();
		}
		
	}

}
