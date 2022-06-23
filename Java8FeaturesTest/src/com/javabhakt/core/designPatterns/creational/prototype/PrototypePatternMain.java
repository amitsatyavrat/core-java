package com.javabhakt.core.designPatterns.creational.prototype;

public class PrototypePatternMain {

	public static void main(String[] args) {

		ProfessionCache.loadProfessionCache();
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		docProfession.print();
		
		Profession engineerProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engineerProfession);
		engineerProfession.print();
		
		Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherProfession);
		teacherProfession.print();
	}

}
