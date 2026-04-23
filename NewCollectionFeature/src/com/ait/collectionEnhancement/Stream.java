package com.ait.collectionEnhancement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "shalini", 30000.0);
		Employee e3 = new Employee(103, "malini", 40000.0);
		Employee e5 = new Employee(105, "jalini", 20000.0);
		Employee e2 = new Employee(102, "galini", 60000.0);
		Employee e6 = new Employee(106, "kalini", 70000.0);
		Employee e4 = new Employee(104, "dalini", 80000.0);
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e3);
		l.add(e4);
		l.add(e2);
		l.add(e6);
		l.add(e5);
		
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(10);
		al.add(15);
		al.add(15);
		al.add(2);
		al.add(18);
		al.add(18);
		al.add(81);
		// remove the duplicate element
		al.stream().distinct().forEach((r) -> System.out.println(r));
// write a program to print number of duplicate element	

		int duplicatElementCount = (int) (al.size() - al.stream().distinct().count());
		System.out.println(duplicatElementCount + " duplicatElementCount");

		Set<Integer> hs = new HashSet<Integer>(al);
		hs.forEach((e) -> System.out.println(e));
		System.out.println("************* distinct employee");

		l.stream().distinct().forEach(e->System.out.println(e));
		
		//write a program to convert employee into hash map<id,emp-obj ><key value> 
	Map<Integer, Employee> m1=	l.stream().collect(Collectors.toMap((p)->p.getEid(), (p)->p));
System.out.println(m1);
	
	}
}
