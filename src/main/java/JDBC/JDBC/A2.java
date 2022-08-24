package JDBC.JDBC;
import java.util.*;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="datastore")
public class A2 {
	@XmlElement(name="employee")
	private List<A1> employeelist = new ArrayList<>();
	public List<A1> getA1List()
	{
		return employeelist;
	}
	
	

}
