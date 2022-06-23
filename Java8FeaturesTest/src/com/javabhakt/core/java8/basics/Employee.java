package com.javabhakt.core.java8.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
//make mutable class
//1st step
public final class Employee {

	//2nd step
	private final String name;
	private final Date dob;//mutable
	private final List<String> mobile;//mutable
	
	private final Address address;//mutable class-
	
	//3rd step
	public Employee(String name, Date dob, List<String> mobile, Address address) {
		this.name = name;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
	}

	//4th step
	public String getName() {
		return name;
	}

	public Date getDob() {
		return (Date) dob.clone();
	}

	public List<String> getMobile() {
		//return Collections.unmodifiableList(mobile);
		return new ArrayList<>(mobile);
	}
	
	public Address getAddress() {
		//return address;
		return new Address (address.getCity(), address.getZip());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
}
