package cracking.coding.problems;

/**
 * Using divide and conquer
 * @author joel.samuel
 *
 */

public class MaxMin {
	//static MaxMin m=new MaxMin();
	static int max,min;

	public static void main(String ar[])
	{
		int a[]={10,12,25,1,15,39};
		MaxMin.max=MaxMin.min=a[0];
		int[] getMaxMin=MaxMin.maxMin(a, 0, a.length-1, a[0], a[0]);
		System.out.println("Max : "+getMaxMin[0]+"\nMin : "+getMaxMin[1]);
	}

	public static int[] maxMin(int[] a,int i,int j,int max,int min)
	{
		int mid,max1,min1;
		int result[]=new int[2];
		//Small(P)
		if (i==j) 
		{ 
			max = min = a[i]; 
		} 
		else if (i==j-1) // Another case of Small(P)
		{
			if (a[i] < a[j]) 
			{ 
				MaxMin.max = a[j]; 
				MaxMin.min = a[i]; 
			}
			else 
			{ 
				MaxMin.max = a[i]; 
				MaxMin.max = a[j]; 
			}
		}
		else
		{
			// if P is not small, divide P into sub-problems.
			// Find where to split the set.
			mid = ( i + j )/2;
			
			// Solve the sub-problems.
			max1=min1=a[mid+1];
			maxMin( a, i, mid, max, min );    
			maxMin( a, mid+1, j, max1, min1 );
			
			// Combine the solutions.
			if (max < max1) MaxMin.max = max1;
			if (min > min1) MaxMin.min = min1;
		}
		result[0]=MaxMin.max;  result[1]=MaxMin.min;
		return result;
	}

}