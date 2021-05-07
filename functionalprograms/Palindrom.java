package com.functionalprograms;

import java.util.Scanner;

public class Palindrom {

	
		public static void main(String[] args) {
			int remainder;
			int total=0;
			int temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any number:");
			int number=sc.nextInt();
			temp=number;
			
			while(number>0) {
				remainder=number%10;
				total=(total*10)+remainder;
				number=number/10;
				
						
			}
			
			if(temp==total) {
				System.out.println("number is palindrom:"+total);
			}
			else {
				System.out.println("given number is not palindrom:"+total);
			}
		}

	}
	


