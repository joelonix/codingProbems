package cracking.coding.problems;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int subArr[]={-4,15,-6,18,2,-20};
        int maxL=0,maxR=0,l=0,r=0;
		System.out.println("Max sub array is "+maxSubArr(subArr));
		System.out.println("Max sub array is "+getMaxSum(subArr,maxL,maxR,l,r));


	}

	public static int maxSubArr(int arr[]){


		if(arr==null||arr.length==0){
			return Integer.MIN_VALUE;
		}

		int currMax=arr[0];
		int totalMax=arr[0];

		for(int i=1;i<arr.length;i++){
			currMax=Math.max(arr[i], arr[i]+currMax);
			totalMax=Math.max(totalMax, currMax);

		}

		return totalMax;

	}

	public static int getMaxSum(int arr[],int maxLeft,int maxRight,int left,int right){


		int totalMax=0;
		int currMax=0;
		for(int i=0;i<arr.length;i++){
			currMax=currMax+arr[i];
			if(totalMax<currMax){
				totalMax=currMax;
				right=i;
				maxLeft=left;
				maxRight=right;
			}
			else if(currMax<0){
				currMax=0;
				left=i+1;
				right=i+1;
			}
			
		}
		
		System.out.println(maxLeft+"----"+maxRight);
		
		return totalMax;
		//return maxLeft;

	}



}
