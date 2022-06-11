package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3,4,6,2,8,9,5);
		List<String> strings = Arrays.asList("amit", "kumar", "springBoot", "java", "microservices");
		List<Employee> empList = new ArrayList <>();
		empList.add(new Employee(101,"Amit Kumar", 34, "Male", "Senior Manager", 2016, 70000.0));
		empList.add(new Employee(102,"Sumit Kumar", 40, "Male", "Manager", 2020, 50000.0));
		empList.add(new Employee(103,"Samarth Sharma", 45, "Male", "Manager", 2022, 90000.0));
		empList.add(new Employee(105,"Shanvi Sharma", 22, "Female", "Assistant Manager", 2016, 80000.0));
		empList.add(new Employee(104,"Rohan Kumar", 34, "Male", "Manager", 2011, 10000.0));
		empList.add(new Employee(106,"Ankita Kumari", 44, "Female", "Manager", 2016, 30000.0));
		empList.add(new Employee(110,"Anand Kumar", 26, "Male", "Senior Developer", 2019, 40000.0));
		empList.add(new Employee(115,"Pushpa Kumari", 35, "Female", "Developer", 2014, 50000.0));
		//old approach
		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		System.out.println(sum);
		//with stream map
		int sum1 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);
		
		//with stream reduce
		int sum2 = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum2);
		
		//with stream other way
		Optional<Integer> sum3= numbers.stream().reduce(Integer::sum);
		System.out.println(sum3.get().intValue());
		
		//with stream multiply
		int mult = numbers.stream().reduce(1, (a,b) -> a*b);
		System.out.println(mult);
		
		//with stream and ternary
		int max = numbers.stream().reduce(0, (a,b) -> a>b ? a : b);
		System.out.println(max);
		
		//with stream and method ref
		int maxNo = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxNo);
		
		//stream of strings
		String longestStr = strings.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
		System.out.println(longestStr);
		
		//average salary
		OptionalDouble avg = empList.stream().filter(e -> e.getRole().equalsIgnoreCase("Manager"))
		.map(e -> e.getSalary())
		.mapToDouble(i -> i)
        .average();
		System.out.println(avg.getAsDouble());
		//sum salary
		double sum5 = empList.stream().filter(e -> e.getRole().equalsIgnoreCase("Manager"))
				.map(e -> e.getSalary())
				.mapToDouble(i -> i).sum();
		System.out.println(sum5);
	}

}
