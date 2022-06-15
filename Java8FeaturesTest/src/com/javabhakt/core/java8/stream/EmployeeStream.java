package com.javabhakt.core.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList <>();
		empList.add(new Employee(101,"Amit Kumar", 34, "Male", "Senior Manager", 2016, 70000.0));
		empList.add(new Employee(102,"Sumit Kumar", 40, "Male", "Manager", 2020, 50000.0));
		empList.add(new Employee(103,"Samarth Sharma", 45, "Male", "Manager", 2022, 90000.0));
		empList.add(new Employee(105,"Shanvi Sharma", 22, "Female", "Assistant Manager", 2016, 80000.0));
		empList.add(new Employee(104,"Rohan Kumar", 34, "Male", "Manager", 2011, 10000.0));
		empList.add(new Employee(106,"Ankita Kumari", 44, "Female", "Manager", 2016, 30000.0));
		empList.add(new Employee(110,"Anand Kumar", 26, "Male", "Senior Developer", 2019, 40000.0));
		empList.add(new Employee(115,"Pushpa Kumari", 35, "Female", "Developer", 2014, 50000.0));
		
		//how many male and female employees are there
		Map<String, Long> noOfMaleAndFemaleEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee);
		
		//print the name of all department
		empList.stream().map(Employee::getRole).distinct().forEach(System.out::println);
		
		//what is the average age of male and female employee
		Map<String, Double> avgAgeOfMaleAndFemaleEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployee);
		
		//get the details of highest paid employee in the organization
		Optional<Employee> emp =  empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("Employee with highest salary : "+emp.get().getName());
		
		//get name of employees who joined after 2015
		empList.stream().filter(e -> e.getYearOfStart()>2015).map(Employee::getName).forEach(System.out::println);
		
		//count the no of employee in each role
		Map<String, Long> noOfEmpInEachRole = empList.stream().collect(Collectors.groupingBy(Employee::getRole, Collectors.counting()));
		System.out.println(noOfEmpInEachRole);
		
		//average salary for each role
		Map<String, Double> avgSalByRole = empList.stream().collect(Collectors.groupingBy(Employee::getRole, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalByRole);
		
		//youngest male employee as manager
		Optional<Employee> youngestEmpAsManager = empList.stream().filter(e -> e.getGender()=="Male" && e.getRole()=="Manager").min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestEmpAsManager.get().getName());
		
		//most working experience in the organization
		Optional<Employee> mostExperiencedEmp = empList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfStart)));
		System.out.println(mostExperiencedEmp.get().getName());
		//OR with sorted
		Optional<Employee> mee = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfStart)).findFirst();
		System.out.println(mee.get().getName());
		
		//how many males and females employees are there as Manager
		Map<String, Long> maleAndFemaleAsManager = empList.stream().filter(e -> e.getRole()=="Manager").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleAndFemaleAsManager);
		
		//average salary of male and female employee
		Map<String, Double> avgSalOfMaleAndFemaleEmp = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalOfMaleAndFemaleEmp);
		
		//name all employees in each role
		Map<String, List<Employee>> empInEachRole = empList.stream().collect(Collectors.groupingBy(Employee::getRole));
		Set<Entry<String, List<Employee>>> entrySet = empInEachRole.entrySet();
		StringBuilder sb = new StringBuilder();
		for(Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("======================================");
			System.out.println("Employee in "+entry.getKey() +" role ");
			System.out.println("======================================");
			List<Employee> list = entry.getValue();
			for(Employee emp1 : list) {
				System.out.println(emp1.getName());
			}
		}
		//average salary and total salary of the organization
		DoubleSummaryStatistics sumStat = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary : "+sumStat.getAverage());
		System.out.println("Total Salary : "+sumStat.getSum());
		
		//partitioning employees based on the age <=25 and >25
		Map<Boolean, List<Employee>> mapEmpOnAge = empList.stream().collect(Collectors.partitioningBy(t -> t.getAge()>25));
		Set<Entry<Boolean, List<Employee>>> entrySet2 = mapEmpOnAge.entrySet();
		for(Entry<Boolean, List<Employee>> entry: entrySet2) {
			System.out.println("===============================");
			if(entry.getKey()) {
				System.out.println("Employee older than 25 years : ");
			} else {
				System.out.println("Employee younger than or equal to 25 years : ");
			}
			List<Employee> list = entry.getValue();
			for(Employee emp2 : list) {
				System.out.println(emp2.getName());
			}
		}
		//oldest employee in the organization, his age and role?
		Optional<Employee> emp3 = empList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println("Name: "+emp3.get().getName()+" Age: "+emp3.get().getAge()+" Role: "+emp3.get().getRole());
		//OR
		Optional<Employee> emp4 = empList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println("Name: "+emp4.get().getName()+" Age: "+emp4.get().getAge()+" Role: "+emp4.get().getRole());
		
		//all employee details working as a manager and salary>50000
		List<Employee> employeesAsManager = empList.stream().filter(e -> e.getRole().equalsIgnoreCase("Manager") && e.getSalary()>50000).toList();
		System.out.println("Employee as Manager : "+employeesAsManager);
	}

}

class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String role;
	private int yearOfStart;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(int id, String name, int age, String gender, String role, int yearOfStart, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.role = role;
		this.yearOfStart = yearOfStart;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getYearOfStart() {
		return yearOfStart;
	}
	public void setYearOfStart(int yearOfStart) {
		this.yearOfStart = yearOfStart;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", role=" + role
				+ ", yearOfStart=" + yearOfStart + ", salary=" + salary + "]";
	}
	
}
