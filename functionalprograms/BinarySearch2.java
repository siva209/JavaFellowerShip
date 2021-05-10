package com.functionalprograms;

import com.utilityalgorithms.UtilityAlgorithms;

public class BinarySearch2 {
	public static void main(String[] args) {
	UtilityAlgorithms u=new UtilityAlgorithms(); 
	 int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  
	int i=UtilityAlgorithms.binarySearch(arr, 0, arr.length-1, 20);
	System.out.println(i);

}
}
