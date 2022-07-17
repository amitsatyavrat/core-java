package com.javabhakt.core.designPrinciples.solid.dip.solution;

public class ShoppingMall {

	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething (double amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000.00);
		//now try to change debit card into credit card, you will have to change a lot of code here
		//so we should create BankCard which will be implemented by both Credit and Debit cards
	}
}
