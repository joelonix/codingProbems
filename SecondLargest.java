package cracking.coding.problems;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {100,6,10,9,8,11}; 
		int secondValue = secondLargestElement(arr); 
		System.out.println(" The third largest element in the array is :"+secondValue);

	}

	public static int secondLargestElement(int array[]) 
	{ 
		if(array==null) 
		{ 
			throw new ArithmeticException(" The array is empty"); 
		} 

		else 
		{ 
			int length = array.length; 
			int firstLargest = Integer.MIN_VALUE; 
			int secondLargest = Integer.MIN_VALUE; 

			for(int num=0; num<length;num++)
			{ 
				if(firstLargest<array[num])            { 
					secondLargest=firstLargest; 
					firstLargest = array[num]; 
				} 

				else if((secondLargest<array[num])&&(array[num]!=firstLargest))            
				{ 
					secondLargest = array[num]; 
				} 

			} 
			return secondLargest; 
		} 
	} 
}


