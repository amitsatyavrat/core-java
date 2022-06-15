package com.javabhakt.core.java8.stream;

import java.util.Scanner;

public class ATMDispenser {

	public static void main(String[] args) {

		//input = 530
		//output = 10*50 1*20 1*10
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you amount to be withdrawn: ");
		int amount = sc.nextInt();
		System.out.println(amount);
		boolean isDenominationOf50 = true, isDenominationOf20 = true, isDenominationOf10 = true;
		int denominationOf50 = 0, denominationOf20 = 0, denominationOf10 = 0;
		int balanceAmount = 0;
		//if amount is not positive integer, throw an exception
		if(amount < 0) {
			throw new RuntimeException("Error: Invalid Amount");
		//if amount is not multiple of 10, throw an exception
		} else if (amount % 10 != 0) {
			throw new RuntimeException("Error: Amount should be in multiple of 10");
		} 
		//if all denominations are available in ATM
		if(isDenominationOf50 && isDenominationOf20 && isDenominationOf10) {
			denominationOf50 = amount/50;
			balanceAmount = amount - denominationOf50 * 50;
			System.out.println("balanceAmount : " + balanceAmount);
			if(balanceAmount == 0) {
				System.out.println(denominationOf50+"*50");
				return;
			}
			denominationOf20 = balanceAmount/20;
			balanceAmount = balanceAmount - denominationOf20 * 20;
			System.out.println("balanceAmount : " + balanceAmount);
			if(balanceAmount == 0) {
				System.out.println(denominationOf50+"*50 "+denominationOf20+"*20");
				return;
			} else if(denominationOf20 != 0) {
				System.out.println(denominationOf50+"*50 "+denominationOf20+"*20 "+" 1*10");
				return;
			} else {
				System.out.println(denominationOf50+"*50 "+" 1*10");
				return;
				
			}
		}
	}

}
