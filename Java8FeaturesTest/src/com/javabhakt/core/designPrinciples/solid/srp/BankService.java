package com.javabhakt.core.designPrinciples.solid.srp;
/*Single responsibility principle says that every 
 * java class must perform a single functionality*/

public class BankService {

	public double deposit(double amount, String accountNumber) {
		return amount;

	}

	public double withDraw(double amount, String accountNumber) {
		return amount;

	}

	public void printPassbook() {

	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("home loan")) {

		}
		if (loanType.equals("car loan")) {

		}
		if (loanType.equals("personal loan")) {

		}
	}

	public void sendOtp(String medium) {
		if (medium.equals("email")) {

		}
		if (medium.equals("mobile")) {

		}
	}
}
