package cracking.coding.problems;

import java.util.Arrays;

public class RotateArray {


	public static void main(String args[]){
		int[] array = {1,2,3,4,5};
		int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(array));
		rotateArrayUsingReverse(array, k);
		System.out.println("After Rotation " + k + " times using reversal: ");
		System.out.println(Arrays.toString(array));     
	}

	// Rotate array by using reversing operation on the array
	// O(n) time, O(1) space
	public static void rotateArrayUsingReverse(int[] array, int k) {

		if(k < 0) {
			throw new IllegalArgumentException("k cannot be negative!");
		}

		if(array == null || array.length < 2) {
			return;
		}

		int n = array.length;
		if(k > n)
			k = k%n;

		reverseArray(array, 0, k-1);
		reverseArray(array, k, n-1);
		reverseArray(array, 0, n-1);
	}

	// Reverse an array between start (s) and end (e)
	private static void reverseArray(int[] array, int s, int e) {
		while(s < e) {
			int tmp = array[s];
			array[s] = array[e];
			array[e] = tmp;
			s++;
			e--;
		}
	}
}
