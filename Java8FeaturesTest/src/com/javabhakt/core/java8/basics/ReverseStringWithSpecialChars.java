package com.javabhakt.core.java8.basics;

public class ReverseStringWithSpecialChars {

	public static void rev(char s[], int l, int r)
    {
        for (int i = l; i < r / 2; i++) {
            char temp = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp;
        }
        System.out.println(s);
    }
    public static void reverse(char s[])
    {
        // creating character array of size
        // equal to length of string
        char[] temp = new char[s.length];
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                // storing elements in araay
                temp[x] = s[i];
                x++;
            }
        }
        System.out.println(s);
 
        // reversing the character array
        rev(temp, 0, x);
 
        x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                // updating the origional string
                s[i] = temp[x];
                x++;
            }
        }
 
        String revStr = new String(s);
        System.out.println("reversed string is: " + revStr);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
		//String input = "A@B#CD$E";
		//output = "E@D#CB$A"
        //String str = "Ab,c,de!$";
    	String str = "A@B#CD$E";
        char[] charArray = str.toCharArray();
        //reverse(charArray);
        System.out.println("Input string: " + str);
        reverseWithIsAlphabetic(charArray);
        String revStr = new String(charArray);
 
        System.out.println("Output string: " + revStr);
        
    }
    
    public static void reverseWithIsAlphabetic(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
 
        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
 
            // Both str[l] and str[r] are not special
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
}}
