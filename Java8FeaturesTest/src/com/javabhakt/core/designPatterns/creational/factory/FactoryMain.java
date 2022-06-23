package com.javabhakt.core.designPatterns.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {

		ProfessionFactory pf = new ProfessionFactory();
		pf.getProfession("Doctor").print();
		pf.getProfession("Engineer").print();
		pf.getProfession("Teacher").print();
	}

}
