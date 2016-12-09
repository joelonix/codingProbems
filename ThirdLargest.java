package cracking.coding.problems;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {100,6,10,9,8,11}; 
		int thirdLargestValue = findThirdLargestElement(arr); 
		System.out.println(" The third largest element in the array is :"+thirdLargestValue);

	}

	public static int findThirdLargestElement(int array[]) 
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
			int thirdLargest = Integer.MIN_VALUE;
			/*int firstLargest = array[0]; 
			int secondLargest = array[0]; 
			int thirdLargest = array[0];*/
			
			/*int firstLargest = array[0]; 
			int secondLargest =array[1]; 
			int thirdLargest = array[2];*/

			for(int num=0; num<length;num++)
			{ 
				if(firstLargest<array[num])            { 
					thirdLargest=secondLargest; 
					secondLargest=firstLargest; 
					firstLargest = array[num]; 
				} 

				else if((secondLargest<array[num])&&(array[num]!=firstLargest))            
				{ 
					thirdLargest=secondLargest; 
					secondLargest = array[num]; 
				} 

				else if((thirdLargest<array[num])&&(array[num]!=secondLargest))            
				{ 
					thirdLargest = array[num]; 
				} 
			} 
			return thirdLargest; 
		} 
	} 
}


