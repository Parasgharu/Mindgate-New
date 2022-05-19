package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class TreeSetMain {
 public static void main(String[] args) {
	SortedSet<String> nameSortedSet= new TreeSet<String>();
	
	nameSortedSet.add("Paras");
	nameSortedSet.add("Rohit");
	nameSortedSet.add("Dinesh");
	nameSortedSet.add("Mahima");
	nameSortedSet.add("Priyanka");
	
	System.out.println(nameSortedSet);
}
}
