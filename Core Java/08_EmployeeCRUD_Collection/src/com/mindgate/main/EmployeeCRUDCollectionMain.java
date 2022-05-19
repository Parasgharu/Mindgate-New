package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeCRUDCollectionMain {
	public static void main(String[] args) {
		int employeeId ;
		String name ;
		double salary ;
		int choice;
		Employee emp;
		boolean result;
		String countinueChoice;
		
		EmployeeDAO employeeDao = new EmployeeDAO();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Menu");
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Get single employee details");
			System.out.println("5. Get all employees");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();	
			switch (choice) {
			case 1:
				System.out.println(" Enter employeeId");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter salary");
				salary = scanner.nextDouble();
				emp = new Employee(employeeId, name, salary);
				result = employeeDao.addNewEmployee(emp);
				if (result) {
					System.out.println("Employee Added succesfully");
					System.out.println(emp.getEmployeeId());
					System.out.println(emp.getName());
					System.out.println(emp.getSalary());
				} else {
					System.out.println("Fail to add Employee");
				}
				break;
			case 2:
				System.out.println(" Enter employeeId");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter salary");
				salary = scanner.nextDouble();
				emp = new Employee(employeeId, name, salary);
				result = employeeDao.updateEmployeeByEmployeeId(emp);
				if (result) {
					System.out.println("Employee details updated Successfully");
					System.out.println(emp.getEmployeeId());
					System.out.println(emp.getName());
					System.out.println(emp.getSalary());
				} else {
					System.out.println("Fail to update Employee details");
				}
				break;
			case 3:
				System.out.println(" Enter employeeId");
				employeeId = scanner.nextInt();
				result = employeeDao.deleteEmployeeByEmployeeId(employeeId);
				if (result) {
					System.out.println("Employee details deleted");
				} else {
					System.out.println("Fail to delete Employee details");
				}

				break;

			case 4:
				System.out.println(" Enter employeeId");
				employeeId = scanner.nextInt();

				Employee e = employeeDao.getEmployeeIdByEmployeeId(employeeId);
				if (e != null) {
					System.out.println("Employee details ");
					System.out.println(e);
				} else {
					System.out.println("invalid employeeid");

				}
				break;

			case 5:
				Set<Employee> e1 = employeeDao.getAllEmployees();
				if (e1 != null) {
					System.out.println("Employee details of all employees");
					System.out.println(e1);
				} else {
					System.out.println("invalid employeeid");
				}

				break;
			}
			System.out.println("Do you want to countinue ? Yes or No");
			countinueChoice = scanner.next();
		} while (countinueChoice.equalsIgnoreCase("Yes"));
	}
}
