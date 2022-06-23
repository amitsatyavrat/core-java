package com.javabhakt.core.java8.basics;

public class FinalFinallyFinalizeDemo {

	private final int i = 10;
	
	public void m1 () /*throws Exception*/ {
		//i = 20;v //can not reassign
		try {
			System.out.println("In try");
		} finally {
			System.out.println("In finally");
			//throw new Exception();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize is called..");
	}
	
	public static void main(String[] args) {

		FinalFinallyFinalizeDemo demo = new FinalFinallyFinalizeDemo();
		demo.m1();
		demo=null;
		//System.gc();
		Runtime.getRuntime().gc();
	}

}
