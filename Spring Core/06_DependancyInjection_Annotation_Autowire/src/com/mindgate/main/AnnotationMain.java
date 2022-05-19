package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Address address = applicationContext.getBean("address", Address.class);
		address.setAddressId(1);
		address.setCity("Mumbai");
		address.setStreet("Saki naka");
		address.setState("Maharashtra");
		
		System.out.println("-".repeat(50));
		
		Employee employee = applicationContext.getBean("employee", Employee.class);
		employee.setHomeAddress(address);
		System.out.println(employee);
	}

}
