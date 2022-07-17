package com.javabhakt.core.designPrinciples.solid.dip.solution;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(double amount) {

		System.out.println("Debit Card");
	}

}
