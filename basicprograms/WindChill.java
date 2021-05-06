package com.basicprograms;

public class WindChill {
	public static double windchill(double t, double v) {
		double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return w;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double d=windchill(20, 30);
   System.out.println(d);
	}

}
