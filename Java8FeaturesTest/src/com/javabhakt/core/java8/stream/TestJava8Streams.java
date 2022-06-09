package com.javabhakt.core.java8.stream;

import java.util.HashMap;
import java.util.Map;
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
		
	}

}
