package com.functionalprograms;

import java.util.Scanner;

public class DayOfWeeks {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter m value");
	int m=sc.nextInt();
	System.out.println("enter d value");
	int d=sc.nextInt();
	System.out.println("enter y value");
	int y=sc.nextInt();
	int y0 = y - (14 - m) / 12;
	System.out.println(y0);
	int x = y0 + y0/4 - y0/100 + y0/400;
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + (31*m0)/12) % 7;
	System.out.println(d0);
		}

	}


