package com.mindgate.main;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> employeeMAp= new TreeMap<Integer, String>();
		
		employeeMAp.put(101, "Pravin");
		employeeMAp.put(111, "Nitesh");
		employeeMAp.put(104, "Paras");
		employeeMAp.put(100, "Vivek");
		
		System.out.println(employeeMAp);
	}

}
