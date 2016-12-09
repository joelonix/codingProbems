package cracking.coding.problems;

import org.omg.CORBA.PUBLIC_MEMBER;

public class NthLargestNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={3,1,2,4,5};
		
		int k=4;
		
		int kth=findKthLargest(a,0,a.length-1, k);
		
		System.out.println(a[kth]);

	}
	
	public static int findKthLargest(int [] arr,int low,int high,int k){
		
		int pivotIndex=partition(arr,low,high);
		
		if(pivotIndex==k){
			return arr[pivotIndex];
		}
		else if(pivotIndex>k){
			return findKthLargest(arr, low, pivotIndex-1, k);
		}
		else{
			return findKthLargest(arr, pivotIndex+1, high, k);
		}
	}
	
	private static int partition(int [] arr,int low,int high){
		int pivot=arr[low];
		
		int i=low+1;
		
		for (int j=low+1;j<=high;j++){
			if(arr[j]<pivot){
				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,low,i-1);
		return i-1;
	}
	
	
	private static void swap(int [] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	
	
}
