package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getEmployees();
	public void addEmployee(Employee emp);
	public Employee getEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
}
