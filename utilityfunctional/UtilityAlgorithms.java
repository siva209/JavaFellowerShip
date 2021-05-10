package com.utilityfunctional;

public class UtilityAlgorithms {
	public void  sort1(int arr[]) {
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
		public void printArray(int arr[]) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
		
		
		public static int bubbesort(String arr[]) {
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].compareTo(arr[j])>0) {
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return 0;
		}
			public void printarry(String arr[]) {
				int n=arr.length;
				for(int i=0;i<n;i++) {
					System.out.println(" "+arr[i]);
					
				
			}
				System.out.println();

}
			
			
			
			public static int binarySearch(int[] a, int beg, int end, int item)  
			{  
			    int mid;  
			    if(end >= beg)   
			    {     
			        mid = (beg + end)/2;  
			        
			        if(a[mid] == item)  
			        {  
			            return mid+1;  
			        }  
			        else if(a[mid] < item)   
			        {  
			            return binarySearch(a,mid+1,end,item);  
			        }  
			        else   
			        {  
			            return binarySearch(a,beg,mid-1,item);  
			        }  
			      
			    }  
			    return -1;   
			}  
		
			
			public static int binarySearch(String[] arr, String x)
		    {
		        int l = 0, r = arr.length - 1;
		        while (l <= r) {
		            int m = l + (r - l) / 2;
		  
		            int res = x.compareTo(arr[m]);
		  
		            
		            if (res == 0)
		                return m;
		  
		            
		            if (res > 0)
		                l = m + 1;
		  
		           
		            else
		                r = m - 1;
		        }
		  
		        return -1;
		    }
		  
		   
		}

