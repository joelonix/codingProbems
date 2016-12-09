package cracking.coding.problems;

import java.util.Arrays;

public class PushZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,0,1,0,1};
		int no = a.length;
		int[] b = new int[no];
		int zcount = 0;
		int ocount = no-1;
		for (int i = 0; i < no; i++) {
			if (a[i]== 0) {//This pushes all the zeros to beginning of the array,to push last change a[i]!=0
				b[zcount] = a[i];
				zcount++;
			} else {
				b[ocount] = a[i];
				ocount--;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}


