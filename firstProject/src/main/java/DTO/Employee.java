package DTO;

public class Employee {
	private int  id;
	private String employeename;
	private String employeenumber;
	private int employeesalary;
	private String employeeaddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public Employee(int id, String employeename, String employeenumber, int employeesalary, String employeeaddress) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.employeenumber = employeenumber;
		this.employeesalary = employeesalary;
		this.employeeaddress = employeeaddress;
	}
	
	

}
