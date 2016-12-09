package cracking.coding.problems;
import java.util.Arrays;


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5};
			        //int k = 8;
			        System.out.println("Original Array: " );
			        System.out.println(Arrays.toString(array));
			        reverseArray(array, 0,array.length-1);
			        System.out.println("After Rotation " + " times using reversal: " );
			        System.out.println(Arrays.toString(array)); 

	}

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
