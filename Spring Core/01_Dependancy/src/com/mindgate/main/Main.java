package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Address address= new Address(1, "Sakinaka", "Mumbai", "Maharashtra");
		Employee employee= new Employee(101, "Paras", 1000, address);
		System.out.println(employee.toString());
	}
}
