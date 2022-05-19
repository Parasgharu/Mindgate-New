package com.mindgate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

@Configuration
//@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {
	@Bean
	public Address address() {
		System.out.println("in address() method of Applicationconfig");
		return new Address();
		
	}
	@Bean
	public Employee employee() {
		System.out.println("in employee() method of Applicationconfig");
//		Address address= new Address();
		Employee employee= new Employee();
		employee.setHomeAddresss(address());
		return employee;
	}
}
