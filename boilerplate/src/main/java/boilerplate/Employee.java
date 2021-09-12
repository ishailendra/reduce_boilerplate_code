package boilerplate;

public class Employee {

	private String empName;
	private String email;
	private String dept;
	
	
	public Employee(String empName, String email, String dept) {
		super();
		this.empName = empName;
		this.email = email;
		this.dept = dept;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
