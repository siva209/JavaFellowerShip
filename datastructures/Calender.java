package com.datastructures;

import java.util.Scanner;

public class Calender {
	
	
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}

	public static void calender(int month,int year)
	 {
		 int[][] monthCalender=new int[6][7];
		// monthCalender[0][0]="Sun";monthCalender[0][1]="Mon";monthCalender[0][2]="Tues";monthCalender[0][3]="Wed";monthCalender[0][4]="Thu";monthCalender[0][5]="Fri";monthCalender[0][6]="Sat";
//		 int len=Integer.valueOf(year).toString().length();
		 int len=4;
		 
		 boolean leap=isLeapYear(year);
		 if(month<1||month>12 || len!=4)
			 System.out.println("Invalid date");
		 else
		 {
			 int day=findDayOfTheWeek(month,year);
			 int daysinmonth=findNoOfDaysInMonth(month,leap);
			 int d=0,w=0;
			 while(d<daysinmonth)
			 {
				 if(d==0)
				 {
					 for(int i=0;i<7;i++)
					 {
						 if(i<day)
							 monthCalender[w][i]=0;
						 else
							 monthCalender[w][i]=++d;
					 } 
				 }
				 else
				 {
					 int j=0;
					 while(j<7 && d<daysinmonth)
					 {
						 monthCalender[w][j]=++d;
						 j++;
					 }
				 }
				 w++;
			 }
			 System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			 for(int i=0;i<6;i++)
			 {
				 for(int j=0;j<7;j++)
				 {
					 if(monthCalender[i][j]==0)
						 System.out.print("    ");
					 else
						 System.out.printf("%-4d",monthCalender[i][j]);
				 }
				 System.out.println();
			 }
		 }
	 }
	 public static int findDayOfTheWeek(int month,int year)
	 {
		 int y0=0;
		 int  x=0;
		 int m0=0;
		 int d0=0;
		 y0 = year-(14 -month) / 12;
		 x=y0+y0/4-y0/100+y0/400;
		 m0=month+12*((14-month)/12)-2;
		 d0=(1+x+31*m0/12)%7;
		 System.out.println("Day="+d0);
		 return d0;
	 }
	 public static int findNoOfDaysInMonth(int month,boolean leap)
	 {
		 if(leap==true && month==2)
			 return 29;
		 else if(leap==false && month==2)
			 return 28;
		 else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			 return 31;
		 else
			 return 30;
	 }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter month");
	int month=sc.nextInt();
	System.out.println("enter year");
	int year=sc.nextInt();
	calender(month, year);
}
}
