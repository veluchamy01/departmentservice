/**
 * 
 */
package com.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentservice.entity.Department;
import com.departmentservice.exception.NoRecordsFoundException;
import com.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mrvel
 *
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department createDepartment(@RequestBody Department department) {
		log.info("Inside createDepartment Controller");
		return departmentService.createDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentbyId(@PathVariable("id") long departmentId) throws Exception {
		log.info("Inside getDepartmentbyId Controller");
		Optional<Department> department =  Optional.of(departmentService.getDepartmentbyId(departmentId));
		if (department.isPresent()) {
			return department.get();
		} else {
			throw new NoRecordsFoundException("No matching records found for the requested id");
		}
	}

}
