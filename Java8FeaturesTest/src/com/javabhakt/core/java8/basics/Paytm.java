package com.javabhakt.core.java8.basics;

public class Paytm implements Payment{

	@Override
	public void doTransaction() {

		System.out.println("From Paytm");
	}

}
