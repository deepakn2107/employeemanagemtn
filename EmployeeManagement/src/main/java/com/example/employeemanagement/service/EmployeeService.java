package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;


public interface EmployeeService {

	public List<Employee> findAll();
	
	public List<Department> findAllFromDepartment();
	
	public Employee findByEmpNo(int empNo);
}
