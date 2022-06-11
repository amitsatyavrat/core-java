package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestJava8Streams {

	public static void main(String[] args) {

		//With stream
		String input = "a,b,a,f,a,h,b,h,s,f,g,d,A,B";
		IntStream intStream = input.chars();
		Stream<Object> charStream = intStream.mapToObj(ch -> (char)ch);
		Map<Object, Long> output = charStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(output);
		//With map containsKey method
		String input1 = "a,b,a,f,a,h,b,h,s,f,g,d,A,B";
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<input1.length();i++) {
			char ch = input1.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		//sort {1,5,@,4,3,%,2,a,8,Z,}
		List<String> strList = Arrays.asList("1","5","@","3","4","7","@","z");
		Collections.sort(strList);
		System.out.println(strList);
		//count 
		
		//print the word which has repetitions
		findDuplicateWord("I am am a a student of java java java java");
		findDuplicateCharacter("thisisamitkumaramitakumar");
	}
	//to find duplicate word in a string
	public static void findDuplicateWord(String str) {
		Map<String, Integer> hm = new HashMap<>();
		String[] strArr = str.split(" ");
		for (String tempStr : strArr) {
			if(hm.get(tempStr) != null) {
				hm.put(tempStr, hm.get(tempStr)+1);
			} else {
				hm.put(tempStr, 1);
			}
		}
		Iterator<String> iter = hm.keySet().iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			if(hm.get(temp) > 1) {
				System.out.println("The word '"+temp+"' has occured "+hm.get(temp)+" times");
			}
		}
	}
	//to find duplicate characters in a string
	public static void findDuplicateCharacter(String str) {
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hm.get(ch) != null) {
				hm.put(ch, hm.get(ch)+1);
			} else {
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
	}

}
