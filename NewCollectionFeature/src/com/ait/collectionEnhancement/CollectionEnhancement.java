package com.ait.collectionEnhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionEnhancement {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(101, "kartik", 4000.0));
		emp.add(new Employee(102, "Manish", 3000.0));
		emp.add(new Employee(103, "jay", 5000.0));
		emp.add(new Employee(104, "shrishant", 7000.0));
		emp.add(new Employee(105, "karan", 8000.0));

		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i).getEid() + " " + emp.get(i).getName() + " " + " " + emp.get(i).getSalary());
		}

		emp.forEach((v) -> {
			System.out.println("last " + v);

		});

		emp.removeIf(p1 -> p1.getName().startsWith("k"));

		// write a program to print employee name whose name is
		// starting with k
		// before java 1.8
		for (int i = 0; i < emp.size(); i++) {
			if (validateName(emp.get(i).getName())) {
				System.out.println(emp.get(i).getName());
			}

		}
		// from java 1.8

		emp.stream().filter((r) -> r.getName().startsWith("k"))
				.forEach((t) -> System.out.println("out :" + t.getName()));

		List<String> list = emp.stream().map((r) -> r.getName()).collect(Collectors.toList());
		System.out.println("map method " + list);

		//write a program to collect all the employeeID  into separate list from emp
	 List<Integer> list2 = emp.stream().map((m)->m.getEid()).collect(Collectors.toList());
	System.out.println(list2);
	}

	public static boolean validateName(String s) {
		if (s.startsWith("k")) {
			return true;
		} else {
			return false;
		}
	}

}
