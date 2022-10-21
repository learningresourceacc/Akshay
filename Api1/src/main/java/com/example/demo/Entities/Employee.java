package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	
	private String employeeName;
	
	private int sapId;
	
	private String status;
	
	private int createId;
	
	private String createdBy;

	public int getEmpId() {
		return empId;
	}

//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSapId() {
		return sapId;
	}

	public void setSapId(int sapId) {
		this.sapId = sapId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCreateId() {
		return createId;
	}

	public void setCreateId(int createId) {
		this.createId = createId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", sapId=" + sapId + ", status=" + status
				+ ", createId=" + createId + ", createdBy=" + createdBy + "]";
	}

	public Employee(String employeeName, int sapId, String status, int createId, String createdBy) {
		super();
		this.employeeName = employeeName;
		this.sapId = sapId;
		this.status = status;
		this.createId = createId;
		this.createdBy = createdBy;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
