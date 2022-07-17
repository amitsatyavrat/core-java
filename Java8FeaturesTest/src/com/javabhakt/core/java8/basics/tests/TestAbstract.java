package com.javabhakt.core.java8.basics.tests;

public abstract class TestAbstract {
	TestAbstract() {}
	abstract void m1();
	void m2(){
	 System.out.println("One");
	 }

	public static void main(String[] args) {

		TestAbstract ta = new TestAbstract() {
			
			@Override
			void m1() {

				System.out.println("m1");
			}
		};
		ta.m2();
	}

}
