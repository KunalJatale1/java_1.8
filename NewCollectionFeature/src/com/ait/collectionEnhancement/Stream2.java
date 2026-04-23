package com.ait.collectionEnhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {

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

		List<String> al = new ArrayList<String>();
		al.add("kartik");
		al.add("kartik");
		al.add("tanishq");
		al.add("Manisha");
		al.add("sanju");
		al.add("krishna");
		al.add("kiran");
		al.add("swati");
		al.add("bharat");

		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(15);
		al2.add(20);
		al2.add(30);
		al2.add(45);
		al2.add(55);
		al2.add(45);
		al2.add(15);

// gropBy count
		System.out.println(al.stream().collect(Collectors.groupingBy((r) -> r, Collectors.counting())));

		// min , max, avg in one place
		DoubleSummaryStatistics d = l.stream().collect(Collectors.summarizingDouble((p) -> p.getSalary()));
		System.out.println(d);
		System.out.println(d);

		System.out.println(al2.stream().limit(4));
		al2.stream().limit(4).filter((p) -> p > 10).forEach(System.out::println);

		// largest number
		System.out.println("largest number");
		al2.stream().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);

		// skip
		System.out.println("skip");

		// write stream program to display second largest number
		System.out.println("second largest");

		Set<Integer> s = new HashSet<Integer>();
		al2.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(System.out::println);

		al2.stream().skip(3).forEach(System.out::println);
		// write a program of employee how getting a second largest salary

		System.out.println("salary ");
		l.stream().sorted(
				(t1, t2) -> (t1.getSalary() < t2.getSalary()) ? -1 : ((t1.getSalary() == t2.getSalary()) ? 0 : -1))
				.limit(2).skip(1).forEach(System.out::println);

		// write a program to print first number in the given array
		System.out.println();

	
		List<String> l1 = new ArrayList<String>();
		l1.add("kartik");
		l1.add("kunal");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("ketan");
		l2.add("kiran");
	// here we are giving list of list of as input and in output we want 
   //   list of string that why we use like that	                                                               
		
		List<List<String>> l3 = new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		System.out.println(l3.stream().flatMap(p->p.stream()).collect(Collectors.toList()));
		
		// using for loop
		
		List<String> result= new ArrayList<String>();
		for (int i = 0; i < l3.size(); i++) {
		        
			List<String> list = l3.get(i);
		
			for (int j = 0; j < list.size(); j++) {
				String string = list.get(j);
			result.add(string);
			}
		}
		
		System.out.println("result"+result);
	}

}