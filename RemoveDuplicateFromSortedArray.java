package cracking.coding.problems;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={10,20,50,40,10,20,60};

		Arrays.sort(arr);

		System.out.println("Original array before removing "+Arrays.toString(arr));
		
		int newSize=removeDuplicates(arr);
		
		//System.out.println("array after removing "+Arrays.toString(arr));

		for (int i = 0; i < newSize; i++) {
			System.out.print(" "+arr[i]);
		}

	}

	static int removeDuplicates(int [] arr){
		int len=arr.length;
		int i=0;

		for(int j=1;j<len;j++)
		{
			if(arr[j]!=arr[i])
			{
				arr[++i]=arr[j];
			}
		}
		return i+1;

	}

}
