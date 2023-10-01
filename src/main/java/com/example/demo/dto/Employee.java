package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  
@AllArgsConstructor  
@Getter
@Setter
public class Employee {

	Integer id;
	String name;
	Double salary;
	@Override
	public boolean equals(Object obj) {
		 final Employee other = (Employee) obj;
	        if (this.name == other.name && this.id==other.id&&this.salary==other.salary ){
	            return true;
	        }
			return false;
	}
	@Override
	public String toString() {
		return this.id + " "+this.name+" "+this.salary;
	}
	
	
	
	
	
}
