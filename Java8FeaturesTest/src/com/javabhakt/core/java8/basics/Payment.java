package com.javabhakt.core.java8.basics;

public interface Payment {

	void doTransaction();
	
	default void addCoupon () {
		System.out.println("Coupon added for Payment: Parent Interface");
	}
	
	static void generateReport () {
		System.out.println("Report Generated");
	}
}
