package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(101, "Meraj");
		employeeMap.put(1025, "Vivek");
		employeeMap.put(103, "Dinesh");
		employeeMap.put(104, "Kiran");
		
		System.out.println(employeeMap);
	}

}
