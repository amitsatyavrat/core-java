package com.javabhakt.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer <Integer> {

	public static void main(String[] args) {

		/*
		 * Consumer<Integer> consumer = t -> System.out.println("Printing No : " +t);
		 * consumer.accept(15);
		 */
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		intList.stream().forEach(t -> System.out.println(t));
	}

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		
	}

}
