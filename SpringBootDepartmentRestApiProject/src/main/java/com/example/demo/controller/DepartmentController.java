package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService; // injected the service
	
// insert
 @PostMapping("/departments/")
public Department saveDepartment(@RequestBody Department department) {
	return departmentService.saveDepartment(department);
}
	
//getRecords(display all record)
@GetMapping("/departments/")
public List<Department> fetchDepartmentList(){
	return departmentService.fetchDepartmentList();
}
	
// get the record by id
@GetMapping("/departments/{id}")
public Department fetchDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException {
  return departmentService.fetchDepartmentById(did);
}
	
// get the record by Name
@GetMapping("/departments/name/{name}")
public Department fetchDepartmentByName(@PathVariable("name") String dname)  {
	return departmentService.fetchDepartmentByName(dname);
}
		
// get the record by code
	@GetMapping("/departments/code/{code}")
	public Department fetchDepartmentByCode(@PathVariable("code") String dcode)  {
	return departmentService.fetchDepartmentByCode(dcode);
}
		
// get the record by address
@GetMapping("/departments/address/{address}")
public Department fetchDepartmentByAddress(@PathVariable("address") String daddress)  {
	return departmentService.fetchDepartmentByAddress(daddress);
}
					
// delete the record
@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException  {
	departmentService.deleteDepartmentById(did);
	return "Department is deleted"; //ask to create method automatically
	
}	
	
	
// update the record
@PutMapping("/departments/{id}")
public Department updateDepartment(@PathVariable("id") Long did,@RequestBody Department department) throws DepartmentNotFoundException {
	return departmentService.updateDepartment(did, department);
}
	
}
	
		
	

