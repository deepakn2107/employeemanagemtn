package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/empList")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/deptList")
	public List<Department> findAllFromDepartment() {
		return employeeService.findAllFromDepartment();

	}

	@GetMapping("/employeeById/{empno}")
	public Employee findByEmpNo(@PathVariable int empno) throws Exception {

		Employee e = employeeService.findByEmpNo(empno);
		if (e == null)
			throw new RuntimeException("Employee details not found with Id " + empno);
		return e;

	}
}
