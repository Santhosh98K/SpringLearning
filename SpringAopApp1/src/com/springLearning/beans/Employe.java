package com.springLearning.beans;

public class Employe {

	private Integer empId;
	private String eName;
	private Integer salary;
	private String email;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", eName=" + eName + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
}

