package cracking.coding.problems;

import java.util.BitSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,5,6};

		System.out.println("The missing element is "+getMissingNumber(arr,6));
		int arr2[]={1, 2, 3, 6, 7, 9, 8, 10};
		printMissingNumber(arr2, 10);

	}

	static int getMissingNumber(int[] numbers,int count){

		int expectedSum=count*(count+1)/2;
		int actualSum=0;

		for(int i:numbers){
			actualSum=actualSum+i;
		}

		return expectedSum-actualSum;
	}

	static void printMissingNumber(int [] numbers,int count){
		int missingCount=count-numbers.length;
		BitSet bitSet=new BitSet(count);
		for(int number:numbers){
			bitSet.set(number-1);
		}
		//System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);

		int lastMissingIndex = 0; 
		for (int i = 0; i < missingCount; i++) 
		{ 
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); 
			System.out.println(++lastMissingIndex); 
		}
	}




}
