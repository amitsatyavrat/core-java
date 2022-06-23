package com.javabhakt.core.java8.basics;

public class StringDemo {

	public static void main(String[] args) {

		//how many objects will be created here
		String s1 = new String ("Amit");
		//1 object for new in heap
		//1 object for literal "Amit" in SCP
		String s2 = "Amit"; //it will not create an object as its already there in SCP
		//intern is used to get object from SCP
		System.out.println(s1.intern().hashCode() == s2.hashCode());
		
		//test string is immutable
		String str = "amit";
		str.concat("kumar");
		System.out.println(str);
		
		//mutable string - StringBuffer and StringBuilder
		StringBuffer sb = new StringBuffer("Java");
		sb.append("/j2ee");
		System.out.println(sb);
	}

}
