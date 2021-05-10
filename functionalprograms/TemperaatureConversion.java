package com.functionalprograms;

import java.util.Scanner;

public class TemperaatureConversion {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter C value");
	float C=sc.nextFloat();
	System.out.println("enter F value");
	float F1=sc.nextFloat();
	System.out.println("convert temp celsius to Fharenhits:"+F1);
	double C1=(F1 - 32) * 5/9 ;
	System.out.println("convet temp F to c:"+C1);
	
	}

}
