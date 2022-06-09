package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		map.put("four", 4);
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		//with stream
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
