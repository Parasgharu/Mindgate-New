package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class AutoWiringMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("product");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);

	}

}
