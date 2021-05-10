package com.functionalprograms;

import com.utilityalgorithms.UtilityAlgorithms;

public class BinarySearchForString {
	public static void main(String[] args) {
		UtilityAlgorithms u=new UtilityAlgorithms();
		
	        String[] arr = { "siva", "ramu", "sravani", "rishi"};
	        String x = "siva";
	        int result = u.binarySearch(arr, x);
	  
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at "
	                              + "index " + result);
	    }
	}
		



