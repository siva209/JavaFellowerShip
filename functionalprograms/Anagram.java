package com.functionalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean areAnagram(String[] str1, String[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2) { /* Here n1 length and n2 length is not same */
			return false;
		}
//		
//		Arrays.sort(str1);
		for(int i=0;i<str1.length;i++) {
			for(int j=i+1;j<str1.length;j++) {
			    if(str1[i].compareTo(str2[j])>0) {
			    	String temp=str1[i];
			    	str1[i]=str1[j];
			    	str1[j]=temp;
			    }
			}
			
			
	
		}
		for(int i=0;i<str1.length;i++) {
			System.out.println(" "+str1[i]);
		}
		
		
		
				
//		System.out.println(str1);
		Arrays.sort(str2);
//		System.out.println( str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}

		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str1 = { "s", "i", "v", "a" };
		String[] str2 = { "s", "i", "v", "a" };
		if (areAnagram(str1, str2)) {
			System.out.println("given Strings are equals so its anagram");
		} else {
			System.out.println("not anagram");
		}

	}

}

