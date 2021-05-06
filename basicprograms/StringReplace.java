package com.basicprograms;

public class StringReplace {
	
	/**
	 * by using this method we can call user
	 * parameters:String
	 * return String
	 */
public static String replace(String name) {
		
		String s1="Hello username>>How are you?";
		 String s2=s1.replace("username", "siva");
		 System.out.println(s2);
		return s2; 
}
public static void main(String[] args) {
	replace("siva");
}
	}


