package com.functionalprograms;

public class BubbleSort {

	void  sort1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
			
		}
}
		void printArray(int arr[]) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,2,3,1,5,7,8,50,4};
		
		System.out.println();
		int n=arr.length;
		BubbleSort b=new BubbleSort();
		b.sort1(arr);
		b.printArray(arr);
	}

}

