package com.javabhakt.core.java8.basics.tests;

//Input1: {1,2,2,4,1} input2: 3 find out max distinct count of subset 3

/*Explanation:

{1,2,,2}-distinct->{1,2}->output:2

{2,2,4}-distinct->{2,4}->output:2

{2,4,1}-distinct->{2,4,1}->output:3

Final output is 3*/

public class TestSubstring2 {
	
	public static void main(String args[]) {
        int[] arr = {1,2,2,4,1};
        String temp = "";
       for (int i=0, j=i+1; i<arr.length/2+1; i++) {
    	   temp = arr[i]+","+arr[i+1]+","+arr[i+2];
    	   System.out.println(temp);
       }
    }

}
