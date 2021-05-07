package com.functionalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2) { /* Here n1 length and n2 length is not same */
			return false;
		}
		Arrays.sort(str1);
		System.out.println(str1);
		Arrays.sort(str2);
		System.out.println( str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}

		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str1 = { 's', 'i', 'v', 'a' };
		char[] str2 = { 'v', 'i', 's', 'p' };
		if (areAnagram(str1, str2)) {
			System.out.println("given Strings are equals so its anagram");
		} else {
			System.out.println("not anagram");
		}

	}

}

