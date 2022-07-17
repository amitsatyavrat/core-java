package com.javabhakt.core.designPrinciples.solid.dip;
/*Dependency Inversion Principle states that we must use abstraction
 * (abstract classes and interfaces) instead of concrete implementations.
 * High level module should not dependent on low level module but both should depend
 * on the abstraction.*/
public class ShoppingMall {

	private DebitCard debitCard;

	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	
	public void doPurchaseSomething (double amount) {
		debitCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPurchaseSomething(5000.00);
		//now try to change debit card into credit card, you will have to change a lot of code here
		//so we should create BankCard which will be implemented by both Credit and Debit cards
	}
}
