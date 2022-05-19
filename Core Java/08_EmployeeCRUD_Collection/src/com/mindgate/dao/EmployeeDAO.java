package com.mindgate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	// add new employee
	public boolean addNewEmployee(Employee employee) {
		if (employee!= null) {
			return employeeSet.add(employee);
		}
//			employeeSet.add(employee);
//			System.out.println("Employee added Succesfully");
//			return true;
		return false;
	
	}

	// update existing employee
	public boolean updateEmployeeByEmployeeId(Employee employee) {
		for (Employee emp : employeeSet) {
			if (emp.getEmployeeId()==employee.getEmployeeId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return true;
			}
		}
		return false;
	}

	// delete employee
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee emp : employeeSet) {
			if (emp.getEmployeeId()==employeeId) {
				return employeeSet.remove(emp);
			}
		}
		return false;
	}

	// get single employee by employee id
	public Employee getEmployeeIdByEmployeeId(int employeeId) {
		for (Employee emp : employeeSet) {
			if (emp.getEmployeeId()== employeeId) {
			 return emp;	
			}
		}
		return null;

	}

	// get all employees

	public Set<Employee> getAllEmployees() {
		return employeeSet;

	}

}
