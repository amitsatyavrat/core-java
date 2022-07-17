package com.javabhakt.core.designPrinciples.solid.dip.solution;

public class CreditCard implements BankCard{

	@Override
	public void doTransaction(double amount) {

		System.out.println("Credit Card");
	}

}
