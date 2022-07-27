package com.example.employeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "deptno")
	private Integer deptno;

	@Column(name = "departname")
	private String dname;
	@Column(name = "location")
	private String location;

	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", location=" + location + "]";
	}

}
