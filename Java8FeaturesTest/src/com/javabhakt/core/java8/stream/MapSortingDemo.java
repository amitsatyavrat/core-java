package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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
		System.out.println("=======================");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//with custom object as a key
		Map<Employee, Integer> mapEmp = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		//change to lambda and use stream
		Map<Employee, Integer> mapEmp2 = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		
		mapEmp2.put(new Employee(101,"Amit Kumar", 34, "Male", "Senior Manager", 2016, 70000.0), 60);
		mapEmp2.put(new Employee(102,"Sumit Kumar", 40, "Male", "Manager", 2020, 50000.0), 40);
		mapEmp2.put(new Employee(103,"Samarth Sharma", 45, "Male", "Manager", 2022, 90000.0), 50);
		mapEmp2.put(new Employee(105,"Shanvi Sharma", 22, "Female", "Assistant Manager", 2016, 80000.0), 70);
		//System.out.println(mapEmp2);
		mapEmp2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
	}

}
