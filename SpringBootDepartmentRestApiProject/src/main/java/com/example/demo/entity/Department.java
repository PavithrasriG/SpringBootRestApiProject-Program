package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	
	
	// generate the setter and getter method
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	
	// generate the to string
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentCode="
				+ departmentCode + ", departmentAddress=" + departmentAddress + "]";
	}
	
	// generate the constructor field(within arugment)
	public Department(Long departmentId, String departmentName, String departmentCode, String departmentAddress) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.departmentAddress = departmentAddress;
	}
	
	// generate the constructor superclass(without arugment)
	public Department() {
		super();
		
	}
	
	
}
