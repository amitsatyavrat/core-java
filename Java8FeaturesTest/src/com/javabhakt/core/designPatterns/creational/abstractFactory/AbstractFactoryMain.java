package com.javabhakt.core.designPatterns.creational.abstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		AbstractFactoryProducer.getProfession(false).getProfession("Teacher").print();
		AbstractFactoryProducer.getProfession(true).getProfession("Teacher").print();
		
	}

}
