package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "xyz", 100);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
		
//		 boolean result = employeeServiceInterface.addNewEmployee(employee);
//		  
//		 if (result) { System.out.println("Employee Added successfully"); } else {
//		  System.out.println("Failed to add new employee"); }
		 
//		List<Employee> allEmployees=employeeServiceInterface.getAllEmployees();
//		for (Employee emp :allEmployees) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("-".repeat(50));
//		
//		Employee employee2=employeeServiceInterface.getEmployeeByEmployeeId(1);
//		System.out.println(employee2);
		
		Employee employee2= new Employee(21,"Spring JDBC", 2000);
		boolean result=employeeServiceInterface.updateEmployee(employee2);
		if (result) { System.out.println("Employee Update successfully");
		} 
		else {
			  System.out.println("Failed to Update employee"); }
	}

}
