package com.javabhakt.core.java8.basics;

public class Child extends Parent{

	void m1 (int a, int b, int c) {
		System.out.println("3 args");
	}
	
	public static void main (String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		parent.m1(0, 0);
		child.m1(0, 0, 0);
		
	}
}
