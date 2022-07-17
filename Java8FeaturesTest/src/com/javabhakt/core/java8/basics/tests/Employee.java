package com.javabhakt.core.java8.basics.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Employee {

	/*
	 * private void add(int a) { System.out.println("Parent add method"); }
	 */
	
	public void add(int a) {

		System.out.println("Employee add method");

	}

	public static void main(String[] args) {

		new Test2().add(8);
		
		List<? extends Employee> empList = new ArrayList<Employee>();

	}
}

class Test2 extends Employee {

	public void add(int a) {

		System.out.println("Child add method");

	}

}
