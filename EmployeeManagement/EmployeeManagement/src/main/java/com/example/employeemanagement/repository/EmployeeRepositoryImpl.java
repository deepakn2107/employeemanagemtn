package com.example.employeemanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	EntityManager entityManager;
	
	
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Employee> query = currentSession.createQuery("select e from Employee e ", Employee.class);
		
		List<Employee> empList =query.getResultList();
		return empList;
	}



	public List<Department> findAllFromDepartment() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Department> query = currentSession.createQuery("select d from Department d ", Department.class);
		
		List<Department> deptList =query.getResultList();
		return deptList;
	}



	@Override
	public Employee findByEmpNo(int empno) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		return currentSession.get(Employee.class, empno);
	}

}
