package com.functionalprograms;

public class InsertionSort {
	void  sorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	void printArry(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print("  "+arr[i]);
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	int arr[]= {5,4,10,1,6,2};
	int n=arr.length;
	 InsertionSort i=new  InsertionSort();
	 i.sorted(arr);
	 i.printArry(arr);
	
}
	

}
