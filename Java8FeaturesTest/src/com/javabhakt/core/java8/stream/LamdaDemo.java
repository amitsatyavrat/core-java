package com.javabhakt.core.java8.stream;

interface Calculator {
	//void switchOn();
	//void sum(int input);
	int substract(int s1, int s2);
}
public class LamdaDemo {

	public static void main(String[] args) {

		// ()     ->      {body}
		/*Calculator calc = () -> System.out.println("Switch On");
		calc.switchOn();*/
		
		/*Calculator calc = (input) -> System.out.println("Sum: "+input);
		calc.sum(222);*/
		
		/*Calculator calc = (s1, s2) -> s2-s1;
		System.out.println(calc.substract(5, 20));*/
		
		Calculator calc = (s1, s2) -> {
			if (s2 < s1) {
				throw new RuntimeException("S2 should be greater than s1 to substract");
			} else {
				return s2 - s1;
			}

		};
		System.out.println(calc.substract(15, 25));
	}

}
