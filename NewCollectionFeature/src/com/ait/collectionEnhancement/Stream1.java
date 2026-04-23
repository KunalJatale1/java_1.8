package com.ait.collectionEnhancement;

import java.util.ArrayList;

public class Stream1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "shalini", 30000.0);
		Employee e3 = new Employee(103, "malini", 40000.0);
		Employee e5 = new Employee(105, "jalini", 20000.0);
		Employee e2 = new Employee(102, "galini", 60000.0);
		Employee e6 = new Employee(106, "kalini", 70000.0);
		Employee e4 = new Employee(104, "dalini", 80000.0);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e3);
		al.add(e4);
		al.add(e2);
		al.add(e6);
		al.add(e5);
		
	System.out.println("sort employee List");
	
	al.stream().sorted().forEach((p)->System.out.println(p));
	//al.stream().min((t1,t2)->(t1.getSalary()<t2.getSalary())?-1);
		
	// this is pending vdo-8
	}
}
