package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		/*long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("Plain Stream taken time : "+ (end-start));
		System.out.println("===========================================");
		long start1 = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::print);
		long end1 = System.currentTimeMillis();
		System.out.println("Parallel strean taken time : "+ (end1-start1));*/
		
		//IntStream.range(1, 10).forEach(x -> System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x));
		//IntStream.range(1, 10).parallel().forEach(x -> System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x));
		
		List<Employee> employees = new ArrayList<>();
		for (int i =1 ; i < 1000 ; i++) {
			employees.add(new Employee(101,"Employee"+i, 34, "Male", "Senior Manager", 2016, Double.valueOf(new Random().nextInt(1000*100))));
		}
		//get average salary with stream
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		System.out.println("Start Time: "+start);
		double avgWithStream = employees.stream()
				.map(Employee::getSalary)
				.mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("End Time: "+end);
		System.out.println("Normal stream time taken : "+ (end - start));
		System.out.println("Normal Stream: "+avgWithStream);
		start = System.currentTimeMillis();
		System.out.println("Start Time: "+start);
		double avgWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("End Time: "+end);
		System.out.println("Parallel stream time taken : "+ (end - start));
		System.out.println("Parallel Stream: "+avgWithParallelStream);
	}

}
