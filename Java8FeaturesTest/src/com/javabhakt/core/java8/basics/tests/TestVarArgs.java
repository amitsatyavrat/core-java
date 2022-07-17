package com.javabhakt.core.java8.basics.tests;

public class TestVarArgs {
	
	void add(int...args) {
		System.out.println("Parent");
	}
	
	void add(int i, int j) {
		System.out.println("Parent 2 args");
	}
	
	public static void main(String[] args) {

		TestVarArgs test = new Child();
		test.add(1,2);
	}

}

class Child extends TestVarArgs {
	void add(int...args) {
		System.out.println("Child");
	}
	
	void add(int i, int j) {
		System.out.println("Child 2 args");
	}
	
}
