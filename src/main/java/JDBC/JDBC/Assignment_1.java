package JDBC.JDBC;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Assignment_1 

{
	private int salary;
	private int empid;
	private String empname;
	private String designation;
	
	public Assignment_1()
	{
		
	}
	public Assignment_1(int salry,int empid,String empname,String designation)
	{
	super();
		this.designation = designation;
		this.empid = empid;
		this.empname = empname;
		this.salary =salry;  
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	

	
}
