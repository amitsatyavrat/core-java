package com.javabhakt.core.java8.basics;

public class PhonePe implements Payment{

	@Override
	public void doTransaction() {

		System.out.println("From PhonePe");
	}

}
