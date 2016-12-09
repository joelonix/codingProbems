package cracking.coding.problems;

public class KthLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={4,5,8,1,2,3,5,7,6};
		
		KthLargestNumber sol=new KthLargestNumber();
		//int kthlargetNum=sol.quickSelect(arr, 0, arr.length-1, 3);
		System.out.println("the third largest no is "+sol.quickSelect(arr, 0, arr.length-1, 2));

	}
	
	


	/*K is the kth largest element to find. Initial call
	to this function should be called with 0 and size-1 for
	low and high respectively.*/

	int quickSelect(int[] a, int low, int high, int k)
	{
	    //assert(a);
	    assert(k <= high+1);
	    if (low == high)
	        return a[low];
	    int pivotIdx = partition(a, low, high);
	    int sizeOfLeftSubArray = pivotIdx - low + 1;
	    
	    /*If'pivotIdx' is greater than 'k', keep looking towards
	    left part*/
	    if (sizeOfLeftSubArray > k)
	    {
	        return quickSelect(a, low, pivotIdx-1, k);
	    }
	    
	    /*If'pivotIdx' is less than 'k', keep looking towards
	    right part*/
	    else if (sizeOfLeftSubArray < k)
	    {
	        return quickSelect(a, pivotIdx+1, high, k-sizeOfLeftSubArray);
	    }
	    /*We just found our kth index, return it*/
	    else
	    {
	        return a[pivotIdx];
	    }
	}
	
	int partition(int[] a, int low, int high)
	{
	    /*Start index for scanning the array*/
	    int left = low;
	    /*Select middle element of the array as pivot*/
	    //int pivotIdx = low + (high - low)/2;
	    int pivotIdx=high;
	    /*Swap pivot with right most element of the array*/
	   /* int pivot = a[pivotIdx];
	    a[pivotIdx] = a[high];
	    a[high] = pivot;
	    pivotIdx = high;*/
	    int pivot=a[pivotIdx];
	    /*Pivot will be placed at this index such that all elements
	    to right of it are greater than pivot and all elements to
	    the left of it are smaller than pivot*/
	    int partitionIdx = low;
	    while (left < high)
	    {
	        /*Initially our partition index is set to leftmost element
	        index in the input array. We keep traversing towards right
	        of the input array and if we find an element lesser than
	        pivot, we swap it with element at partiotion index and 
	        increment partition index else just keep moving right*/
	        if (a[left] < pivot) 
	        {
	            int tmp = a[left];
	            a[left] = a[partitionIdx];
	            a[partitionIdx] = tmp;
	            ++partitionIdx;
	        }
	        ++left;
	    }
	    /*Place the pivot value at the partition index*/
	    a[pivotIdx] = a[partitionIdx];
	    a[partitionIdx] = pivot;
	    return partitionIdx;
	}

}
