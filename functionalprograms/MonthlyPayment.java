package com.functionalprograms;

public class MonthlyPayment {
	public static double monthlypayment(double P, double Y, double R) 
	{
		double n=12*Y;
		double r=R/(12*100);
		double a=P*r;
		double b=Math.pow((1+r),-n);
		double payment=a/(1-b);
		return payment;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double d=monthlypayment(100, 200, 400);
System.out.println(d);

	}

}
