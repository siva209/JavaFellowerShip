package com.functionalprograms;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter starting value :");
       int start=sc.nextInt();
       
       System.out.println("Enter ending value :");
       int end=sc.nextInt();


        while (start < end) {
            if(checkPrimeNumber(start))
                System.out.print("  "+start);

            start++;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}


