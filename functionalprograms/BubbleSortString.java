package com.functionalprograms;

public class BubbleSortString {
	public static void bubbesort(String arr[]) {
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
	
	}
		void printarry(String arr[]) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.println(" "+arr[i]);
				
			
		}
			System.out.println();
		
}
		public static void main(String[] args) {
			String arr[]= {"siva","sravani","ashok","nan","bhart","dog"};
			BubbleSortString b=new BubbleSortString();
			b.bubbesort(arr);
			b.printarry(arr);
		}
}
