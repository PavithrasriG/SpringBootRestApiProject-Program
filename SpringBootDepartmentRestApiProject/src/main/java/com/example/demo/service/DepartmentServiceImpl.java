package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.Departmentrepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	Departmentrepository departmentRepo;

//insert
	@Override
	public Department saveDepartment(Department department) {
       return departmentRepo.save(department);
	}

// get record(display the record)
	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepo.findAll();// get all the record
	}
	
// get the record by id
	@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		
		Optional<Department> department1 =departmentRepo.findById(did);
		if(!department1.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Available");
		}
		return departmentRepo.findById(did).get();
	}
	
	
// get the record by name		
	@Override
	public Department fetchDepartmentByName(String dname)  {

   return departmentRepo.findByDepartmentName(dname);//department.java get the department name create the method of repostiory
	}	     
		
	
// get the record by code	
	@Override
	public Department fetchDepartmentByCode(String dcode)  {
		return departmentRepo.findByDepartmentCode(dcode);//department.java get the department code create the method of repostiory
	}
	
	
// get the record by address
	@Override
	public Department fetchDepartmentByAddress(String daddress)  {
		return departmentRepo.findByDepartmentAddress(daddress);//department.java get the department address create the method of repostiory
	}

	
// delete
	@Override
	public void deleteDepartmentById(Long did) throws DepartmentNotFoundException {
        
		//check for null
		Optional<Department> department1 =departmentRepo.findById(did); //check in database
		if(!department1.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Available");
		}else {	
		
		departmentRepo.deleteById(did);
		
	}
	}

//update the record
	@Override
	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException {
     
		Optional<Department> department1=departmentRepo.findById(did);// check id
		Department depDB=null;
		
		if(department1.isPresent()) {
		 depDB=departmentRepo.findById(did).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
			
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			System.out.println(department.getDepartmentAddress());
		}
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
			System.out.println(department.getDepartmentCode());
		}
		return departmentRepo.save(depDB);
		}//id
		else {
			throw new DepartmentNotFoundException("Department Not available");
		}

	}//update

	

	
	
}
