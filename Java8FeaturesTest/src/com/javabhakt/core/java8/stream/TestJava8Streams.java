package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.javabhakt.core.java8.basics.marker.Entity;

public class TestJava8Streams {

	public static void main(String[] args) {
		//String input = "A@B#CD$E";
		//output = "E@D#CB$A"
		
		//check palindrome
		String inputString = "kayaka";
        char[] ch2 = inputString.toCharArray();
        String str = "";
        for (int i = ch2.length-1; i>=0 ; i--) {
            str = str + ch2[i];
        }
        if(inputString.equals(str))
        System.out.println("Given string is a plindrome");
        
        //other way to check palindrome
        boolean flag = true;
        for (int i=0, j=ch2.length-1;i< ch2.length-1 &&j> 0;i++,j--) {
        	if(ch2[i] != ch2[j]) {
        		flag=false;
        		System.out.println("Not a palindrome");
        		break;
        	}
        }
        if(flag)
        System.out.println("Palindrome");

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
		//print key and value
		for (Entry<Character, Integer> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
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
