package com.javabhakt.core.java8.basics.tests;

public class TestStringReverse {

	public static void main(String[] args) {

		String input = "This is a sentence .";
	      String output = ". sentence a is This";
	      char[] arr = input.toCharArray();
	      int ascii = ' ';
	      int count = 0;
	      System.out.println("ASCII value of space is: "+ascii);
	      for (int i=arr.length-1; i>0; i--) {
	    	  int asci = arr[i];
	          if(asci == 32) {
	        	  count = i-1;
	              for(int j = i+1; j>arr.length - i; j--) {
	                  System.out.print(arr[j]);
	              }
	          }
	      }
	}

}
