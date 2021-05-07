package com.functionalprograms;

public class InsertionsortForString {
	void insertsort(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			String temp=arr[i];
			int j=i-1;
			
			while(j>=0&&arr[j].compareTo(temp)>0) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
			
			
			
			
		}
		void printArry(String[] arr) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.print("  "+arr[i]);
			}
			System.out.println();
		}

		public static void main(String[] args) {
			String []arr= {"siva","ramu","yogi","uma","ashok","charan"};
			int n=arr.length;
			InsertionsortForString i=new InsertionsortForString();
			i.insertsort(arr);
			i.printArry(arr);
		}
			
				}
		