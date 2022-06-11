package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static Customer getCustomerByEmailId (List<Customer> customers, String email) throws Exception {
		return customers.stream().filter(customer -> customer.getEmail().equalsIgnoreCase(email)).findAny().orElseThrow(() -> new Exception("Customer not found for this email"));
		
	}

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(101, "Amit Kumar", null, Arrays.asList("2131232131","24324234234"));
		Customer customer2 = new Customer(102, "Amit Kumar", "abc@gmail.com", Arrays.asList("2131232131","24324234234"));
		//empty, of, ofNullable
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		//Optional<String> emailOptional = Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		
		Optional<String> emailOfNullable = Optional.ofNullable(customer.getEmail());
		if(emailOfNullable.isPresent()) {
			System.out.println(emailOfNullable.get());
		}
		System.out.println(emailOfNullable.orElse("default@gmail.com"));
		System.out.println(emailOfNullable.isPresent());//if email present then returns true, if email is null then false
		Optional<String> emailOfNullableFalse = Optional.ofNullable(customer2.getEmail());
		if(emailOfNullableFalse.isPresent()) {
			System.out.println(emailOfNullableFalse.get());
		}
		//default email
		String defaultEmail = Optional.ofNullable(customer.getEmail()).orElse("default@gmail.com");
		String defaultEmail2 = Optional.ofNullable(customer2.getEmail()).orElse("default@gmail.com");
		System.out.println(defaultEmail);//email is null, so it will print default
		System.out.println(defaultEmail2);//email is present, so it will print the same
		
		//get email or throw ex
		List<Customer> customers = new ArrayList<>();
		//customers.add(customer);
		customers.add(customer2);
		OptionalDemo.getCustomerByEmailId(customers, "aaa@gmail.com");
	}

}
