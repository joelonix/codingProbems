package cracking.coding.problems;

public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values={5,10,6,5,10,1,10};
		int newSize=removeDuplicates(values,values.length);
		for (int i = 0; i < newSize; i++) {
			
			System.out.print(values[i]+" ");
		}

	}
	
	public static int removeDuplicates(int []a,int currentSize){
		int start=0;
		while(start<currentSize){
			int removed=removeFromTail(a,currentSize,start+1,a[start]);
			currentSize=currentSize-removed;
			start++;
		}
		return currentSize;
	}

	public static int removeFromTail(int []a,int currentSize,int start,int toberemoved){
		int source=start;
		int target=start;
		int removed=0;
		while(source<currentSize){
			if(a[source]==(toberemoved)){
				System.out.println(a[source]);
				removed++;
			}
			else{
				a[target]=a[source];
				target++;
			}
			source++;
		}
		return removed;
	}
}
