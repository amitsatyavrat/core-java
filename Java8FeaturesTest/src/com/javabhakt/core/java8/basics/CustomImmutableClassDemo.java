package com.javabhakt.core.java8.basics;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class CustomImmutableClassDemo {

	public static void main(String[] args) {

		Address address = new Address ("Pune", "411027");
		Employee emp = new Employee("Amit", new Date(), Arrays.stream(new String [] {"1234","5678"}).collect(Collectors.toList()), address);
		emp.getDob().setDate(15);//we are able top modify the date so return cloned object
		System.out.println(emp);
		
		emp.getMobile().add("12131");//we are able to modify the list of mobile no, so return unmodifiableList or a new arrayList
		System.out.println(emp);
		
		emp.getAddress().setCity("London");//we are able to modify the city, so return new address object by setting fields
		System.out.println(emp);
	}

}
