package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@Override
	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
	}

}
