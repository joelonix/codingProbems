package cracking.coding.problems;

public class DeleteStringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String values[]={"A","O","M","A"};
		int newSize=removeDuplicates(values,values.length);
		for(int i=0;i<newSize;i++){
			System.out.print(" "+values[i]);
		}

	}
	
	static int removeDuplicates(String [] a,int currentSize){
		int start=0;
		while(start<currentSize){
			int removed=removeFromTail(a,currentSize,start+1,a[start]);
			currentSize=currentSize-removed;
			start++;
		}
		
		return currentSize;
		
		
	}
	
	static int removeFromTail(String a[],int currentSize,int start,String toberemoved){
		int source=start;
		int target=start;
		int removed=0;
		
		while (source<currentSize) {
			
			if(a[source].equals(toberemoved)){
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
