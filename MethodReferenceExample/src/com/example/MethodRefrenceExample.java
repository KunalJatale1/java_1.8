package com.example;

public class MethodRefrenceExample {

	public static void main(String[] args) {

		MethodRefrenceExample mr = new MethodRefrenceExample();

		Test t = (y) -> MethodRefrenceExample.show(y);// this is one way to write lambda for static method

		Test t1 = MethodRefrenceExample::show;// this is second way to write lambda for static method

		
		Test t2 = (y) -> mr.add(y); // first way for instance method

		Test t3=mr::add;// second way for instance method
	}

	static void show(int x) {
		int c = x + 1000;
		System.out.println(c);
	}

	void add(int i) {
		int a = 20 + i;
		System.out.println(a);
	}
}
