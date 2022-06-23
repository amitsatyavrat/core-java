package com.javabhakt.core.java8.basics;

public class GooglePay implements Payment {

	@Override
	public void doTransaction() {

		System.out.println("Doing transaction with GooglePay");
	}
	
	@Override
	public void addCoupon() {
		//Payment.super.addCoupon();
		System.out.println("Overriden addCoupon");
	}
	
	public static void main (String[] args) {
		Payment gp = new GooglePay();
		gp.addCoupon();
		Payment.generateReport();
	}

}
