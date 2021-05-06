package com.basicprograms;

public class PowersOf2 {
	/**
	 * calculating the power of 2
	 * @param pow
	 * @return power value
	 */
	static int powerOf2(int pow) {
		int i=0;
		int power=1;
		System.out.println("power of 2 that are less then 2^"+pow);
		while(i<=pow) {
			System.out.println("2^"+i+"="+power);
			power=power+power;
			i++;
		}
		return power;
		}
			
		public static void main(String[] args) {
			int p=powerOf2(5);
			System.out.println(p);
		}	
		
}
