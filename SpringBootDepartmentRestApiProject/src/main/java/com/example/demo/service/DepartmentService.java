package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

public interface DepartmentService {

public	Department saveDepartment(Department department);

public	List<Department> fetchDepartmentList();
	
public	Department fetchDepartmentById(Long did) throws DepartmentNotFoundException; //implement in DepartmentServiceImpl.java

public	Department fetchDepartmentByName(String dname);

public	Department fetchDepartmentByCode(String dcode) ;

public	Department fetchDepartmentByAddress(String daddress) ;

public	void deleteDepartmentById(Long did) throws DepartmentNotFoundException; 

public   Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException;


	

      

}
