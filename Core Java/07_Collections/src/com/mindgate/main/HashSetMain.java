package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Paras");
		nameSet.add("Vivek");
		nameSet.add("Dinesh");
		nameSet.add("Kiran");
		nameSet.add("Paras");

		System.out.println(nameSet);

		System.out.println("-".repeat(50));

		Employee employee1 = new Employee(101, "VIvek", 1000);
		System.out.println(employee1.hashCode());
		Employee employee2 = new Employee(102, "Chaitanya", 2000);
		System.out.println(employee2.hashCode());
		Employee employee3 = new Employee(103, "Kiran", 2000);
		System.out.println(employee3.hashCode());
		Employee employee4 = new Employee(101, "VIvek", 1000);
		System.out.println(employee4.hashCode());

		Set<Employee> employeesSet = new HashSet<Employee>();
		employeesSet.add(employee1);
		employeesSet.add(employee2);
		employeesSet.add(employee3);
		
		employeesSet.add(employee4);

		for (Employee employee : employeesSet) {
			System.out.println(employee);
		}
		
		Integer i= Integer.valueOf(10);
		System.out.println(i.hashCode());
		
		String s= new String("Hi");
		System.out.println(s.hashCode());
		
		s= s+ "Hello";
		System.err.println(s.hashCode());
	}

}
