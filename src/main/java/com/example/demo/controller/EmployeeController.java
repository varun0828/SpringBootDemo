package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping(value="/addemployee")
	public void addEmployee(@RequestBody Employee emp)
	{
		empService.addEmployee(emp);
	}

	@GetMapping(value="getemployees",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployeeDetails()
	{
		return empService.getEmployees();
			
	}
	
	@DeleteMapping(value="deleteemployee")
	public void deleteEmployee(@RequestBody Employee emp)
	{
		empService.deleteEmployee(emp);
	}
}