/**
 * 
 */
package com.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentservice.entity.Department;
import com.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mrvel
 *
 */
@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department createDepartment(Department department) {
		log.info("Inside createDepartment Service");
		return departmentRepository.save(department);
	}

	public Department getDepartmentbyId(long departmentId) {
		log.info("Inside getDepartment Service");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
