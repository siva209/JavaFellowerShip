package com.datastructures;

public class DaysInMonth {
public static int findNoOfDaysInMonth(int month,boolean leap) {
	if(leap==true && month==2) {
		return 29;
	}
	else if(leap==false && month==2) {
		return 28;
	}
	else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		return 31;
	}else {
		return 30;
	}
}
public static void main(String[] args) {
	int i=findNoOfDaysInMonth(2, false);
	System.out.println(i);
	
}
}
