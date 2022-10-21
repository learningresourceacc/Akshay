package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_role_master")
public class RoleMaster {

	@Id
	private int roleId;
	
	@OneToOne
	@JoinColumn(name="empId",referencedColumnName = "empId")
	private Employee employee;
	
	private int sapId;
	
	private String designation;
	
	private String empBand;
	
	private int createdId;
	
	private int createdBy;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Employee getEmpId() {
		return employee;
	}

	public void setEmpId(Employee employee) {
		this.employee = employee;
	}

	

	public int getSapId() {
		return sapId;
	}

	public void setSapId(int sapId) {
		this.sapId = sapId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpBand() {
		return empBand;
	}

	public void setEmpBand(String empBand) {
		this.empBand = empBand;
	}

	public int getCreatedId() {
		return createdId;
	}

	public void setCreatedId(int createdId) {
		this.createdId = createdId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "RoleMaster [roleId=" + roleId + ", empId=" + employee + ", sapId=" + sapId + ", designation=" + designation
				+ ", empBand=" + empBand + ", createdId=" + createdId + ", createdBy=" + createdBy + "]";
	}

	public RoleMaster(int roleId, Employee empId, int sapId, String designation, String empBand, int createdId,
			int createdBy) {
		super();
		this.roleId = roleId;
		this.employee = empId;
		this.sapId = sapId;
		this.designation = designation;
		this.empBand = empBand;
		this.createdId = createdId;
		this.createdBy = createdBy;
	}

	public RoleMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
