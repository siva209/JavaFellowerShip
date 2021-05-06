package com.basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any year");
int year=sc.nextInt();

if(year % 400 ==0 ||(year %4==0 && year %100 !=0)){
	System.out.println("given year is leap year");
	
}
else {
  System.out.println("given year is not leap year");
}
}


	}


