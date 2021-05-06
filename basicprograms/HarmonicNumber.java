package com.basicprograms;

public class HarmonicNumber {
	/**
	 * find the harmonic range for particular number
	 * @param range
	 * @return sum
	 */

	static double nthHarmonic(int range) {
		double sum=1;
		for(int i=2;i<range;i++) {
			sum=sum+1.0/i;
		}
		return sum;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	double h=nthHarmonic(5);
	System.out.println(h);

		}

	}


