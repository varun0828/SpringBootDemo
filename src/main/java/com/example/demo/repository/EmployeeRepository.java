package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employee;

@Repository
public interface EmployeeRepository {
	public Employee getEmployee(Integer empId);
	public List<Employee> getEmployees();
	public void addEmployee(Employee emp);
	public void deleteEmployee(Integer empId);

}
