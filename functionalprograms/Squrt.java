package com.functionalprograms;

import java.util.Scanner;

public class Squrt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter c value");
double c=sc.nextDouble();
double epsilon = 1.0e-15; 
double t=c;
while(Math.abs(t-c/t)>epsilon*t) {
	 t = (c/t + t) / 2.0;
}
System.out.println(t);
	}

}

