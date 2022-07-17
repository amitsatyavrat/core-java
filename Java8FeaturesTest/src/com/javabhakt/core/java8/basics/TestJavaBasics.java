package com.javabhakt.core.java8.basics;

public class TestJavaBasics {

	public static void main(String[] args) {

		double amount = 20.25;
		System.out.println(amount%10);
		
		try {
			System.out.println("try");
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("Catch Arith");
		} catch (Exception e) {
			System.out.println("Catch Exe");
		} finally {
			System.out.println("finally");
		}
		System.out.println("after finally");
	}

}
