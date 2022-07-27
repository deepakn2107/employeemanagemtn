package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override
	public List<Department> findAllFromDepartment() {
		// TODO Auto-generated method stub
		return employeeRepository.findAllFromDepartment();
	}

	@Override
	public Employee findByEmpNo(int empNo) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmpNo(empNo);
	}

}
