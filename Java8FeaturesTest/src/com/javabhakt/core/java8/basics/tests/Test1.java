package com.javabhakt.core.java8.basics.tests;

public class Test1 {

	public static void main(String[] args) {

		Test1 obj = new Test1(5);

	}

	public Test1(int m) {

		System.out.println("constructor method");

	}

	{

		System.out.println(" instance block");

	}

	static {

		System.out.println(" static block");

	}

}
