package com.javabhakt.core.java8.stream;

import java.util.Arrays;

public class JavaMostAskedPrograms {

	public static void main(String[] args) {

		String str1 = new String("Amit");
		String str2 = new String("Amit");
		String str3 = "Amit";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		//to check anagram (all characters should be same in both the strings)
		String input = "LISTEN";
		String input2 = "SILENT";
		boolean status = true;
		char[] ch1 = input.toLowerCase().toCharArray();
		char[] ch2 = input2.toLowerCase().toCharArray();
		if(ch1.length != ch2.length) {
			status = false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}
		if(status) {
			System.out.println("Both are anagrams");
		} else {
			System.out.println("Not an anagram");
		}
		}
}