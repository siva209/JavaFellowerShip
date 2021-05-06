package com.basicprograms;

public class FlipCoins {
	/**
	 * calculating the head by tail percentage
	 * @param flips
	 * @return int totalP
	 */

	static int flips(int flip) {
		int heads=0;
		int tails=0;
		for(int i=0;i<flip;i++) {
			if(Math.random()<0.5) {
				heads++;
			}
			else {
				tails++;
			}
		}
			System.out.println("number of heads:"+heads);
			System.out.println("number of tails:"+tails);
			int Hp=(int) (100.0*heads/flip);
			int Tp=(int) (100.0*tails/flip);
			int totalP=Hp+Tp;
			System.out.println("percentage of heads:"+Hp);
			System.out.println("percentage of tails:"+Tp);
			return totalP;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int f=flips(5);
	System.out.println(f);
		}

	}



