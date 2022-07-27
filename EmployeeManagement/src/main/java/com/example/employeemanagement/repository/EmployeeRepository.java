package com.example.employeemanagement.repository;

import java.util.List;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;

public interface EmployeeRepository {

	public List<Employee> findAll();
	
	public List<Department> findAllFromDepartment();
	
	public Employee findByEmpNo(int empno);
}
