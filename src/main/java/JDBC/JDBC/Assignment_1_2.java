package JDBC.JDBC;
import java.io.FileOutputStream;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

 

 
  

public class Assignment_1_2 {
	
	public static void main(String[] args) throws Exception {
		
		 JAXBContext j = JAXBContext.newInstance(Assignment_1.class); 
		 
		 Marshaller m = j.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 Assignment_1 a = new  Assignment_1(25000,1381,"rampandu","developer");
		 m.marshal(a, new FileOutputStream("C:\\JDBC\\src\\main\\java\\JDBC\\JDBC\\Assignment_1.xml"));
		
	}

}
