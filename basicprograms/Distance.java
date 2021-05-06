package com.basicprograms;

public class Distance {
	public static double distance(double x, double y) {
		double distance = Math.pow((x * x + y * y), 0.5);
		return distance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double d=distance(3, 4);
System.out.println(d);
	}

}
