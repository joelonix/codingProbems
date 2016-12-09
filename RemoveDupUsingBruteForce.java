package cracking.coding.problems;

public class RemoveDupUsingBruteForce {
	/**
	 * @ author:Candid @ description:Java Program to delete Duplicate elements
	 * in an array
	 */

	int arr[]=new int[5];
	public static void main(String args[])

	{

		// array of ten  elements
		int array[] = { 10, 20,30,10,50,20 };

		int size = array.length;
		System.out.println("Size before deletion: " + size);

		for (int i = 0; i < size; i++)
		{

			for (int j = i + 1; j < size; j++)
			{

				// checking one element with all the element
				if (array[i] == array[j]) 

				{
					while (j < (size) - 1)
					{
						array[j] = array[j + 1];// shifting the values
						j++;
					}  
					size--;
				}
			}
		}
		System.out.println("Size After deletion: " + size);

		for (int k = 0; k < size; k++)
		{
			System.out.println(array[k]); // printing the values
		}
	}
}
