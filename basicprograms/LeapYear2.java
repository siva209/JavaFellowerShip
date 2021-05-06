package com.basicprograms;

public class LeapYear2 {
	/**
	 * check whether the given year is leap year or not
	 * @param year
	 * @return boolean year 
	 */
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	boolean b=isLeapYear(2007);
	System.out.println(b);
	
}

}
