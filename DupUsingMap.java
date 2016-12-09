package cracking.coding.problems;

import java.util.HashMap;
import java.util.Map;

public class DupUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int arr[]={3,2,3,1,5,4,2};	
	   
	   System.out.println(isDuplicateExists(arr));
       

	}
	
	static boolean isDuplicateExists(int a[]){
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i: a){
			//get value
			boolean val=map.containsKey(i);
			//if val exists
			if(val){
				map.put(i, map.get(i)+1);
				return true;
			}
			else{
				map.put(i, 1);
			}
		}
		return false;
	}

}
