package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	List<Employee> empList = new ArrayList<Employee>();

	@Override
	public Employee getEmployee(Employee emp) {
		return empList.get(empList.indexOf(emp));
	}

	@Override
	public List<Employee> getEmployees() {
		return empList;
	}

	@Override
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		System.out.println(empList);
		System.out.println(empList.remove(emp));
	}
}
