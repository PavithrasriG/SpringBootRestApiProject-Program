package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department,Long> {

	

public	Department findByDepartmentName(String dname);// customer method

public	Department findByDepartmentCode(String dcode);

public	Department findByDepartmentAddress(String daddress);



	

	

	
}
