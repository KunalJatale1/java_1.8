package com.ait.collectionEnhancement;

public class Employee implements Comparable<Employee> {

	
	private int eid;
	private String name;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (int) e.salary;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return eid;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		Employee e= (Employee) obj;
		if(this.eid==e.eid)
			return true;
		else
			return false;
		
	}
	
}
