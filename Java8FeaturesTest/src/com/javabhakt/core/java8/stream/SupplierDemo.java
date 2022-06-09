package com.javabhakt.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo /* implements Supplier <String> */ {

	public static void main(String[] args) {

		SupplierDemo supplierDemo = new SupplierDemo();
		//System.out.println(supplierDemo.get());
		
		Supplier<String> sd = () -> "Hi Amit !!";
		//System.out.println(sd.get());
		
		List<String> strList = Arrays.asList("a","b","c","d","e");
		List<String> strList1 = Arrays.asList();
		System.out.println(strList.stream().findAny().orElseGet(sd));
		System.out.println(strList1.stream().findAny().orElseGet(() -> "Hi Amit !"));
	}

	/*
	 * @Override public String get() { // TODO Auto-generated method stub return
	 * "Hi Amit !!"; }
	 */

}
