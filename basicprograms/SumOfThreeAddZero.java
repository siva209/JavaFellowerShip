package com.basicprograms;

public class SumOfThreeAddZero {
	static void sum(int arry[]) {
		for(int i=0;i<arry.length;i++)	{
			for(int j=i+1;j<arry.length;j++) {
				for(int k=j+1;k<arry.length;k++) {
					if(arry[i]+arry[j]+arry[k]==0) {
						System.out.println("sum of three numbers are equals to zero ");
						System.out.println("elements are" +arry[i]+" "+arry[j]+" "+arry[k]);
						return;
					}
				}
			}
			
				
			}
		System.out.println("three num not zeros");
		
		}
			
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arry[]= new int[] {1,0,-1};
	sum(arry);
		}

	}

