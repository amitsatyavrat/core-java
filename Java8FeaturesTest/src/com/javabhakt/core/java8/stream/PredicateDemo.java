package com.javabhakt.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		//check for even no
		Predicate<Integer> predicate = t -> t%2==0?true:false;
		System.out.println(predicate);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		//intList.stream().filter(predicate).forEach(t -> System.out.println(t));
		intList.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t));
	}

	/*
	 * @Override public boolean test(Integer t) { if(t%2==0) return true; return
	 * false; }
	 */
}
