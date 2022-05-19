package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo arrayListDemo = new ArrayListDemo();

		List<String> nameList = new ArrayList<String>();

		nameList.add("Paras");
		nameList.add("Dinesh");
		nameList.add("Vivek");

		arrayListDemo.setArrayListId(101);
		arrayListDemo.setNameList(nameList);

		System.out.println(arrayListDemo);

		System.out.println("-".repeat(50));

		List<Integer> numberList = new ArrayList<Integer>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(30);

		System.out.println(numberList);

		System.out.println("-".repeat(50));

		Employee employees = new Employee(101, "VIvek", 1000);
		Employee employee2 = new Employee(102, "Reema", 1000);
		Employee employee3 = new Employee(103, "Seema", 1000);

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(employees);
		employeeList.add(employee2);
		employeeList.add(employee3);

		System.out.println(employeeList);

		System.out.println("-".repeat(50));

		for (Employee employee : employeeList) {
			System.out.println(employee);

		}
	}

}
