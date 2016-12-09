package cracking.coding.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeleteDupUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,10,20,20,30,30,30,45,45,10};	

		Map<Integer,Integer> map=isDuplicateExists(arr);

		ArrayList<Integer> keyList = new ArrayList<Integer>(map.keySet());

		//	Object[] arr2=keyList.toArray();

		//System.out.println(arr2.length);

		//int [] arr2=new int[keyList.size()];
		for(int i=0;i<keyList.size();i++){
			System.out.print(keyList.get(i)+" ");
		}



	}

	static Map<Integer,Integer> isDuplicateExists(int a[]){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();

		for(int i: a){
			//get value
			boolean val=map.containsKey(i);
			//if val exists
			if(val){
				map.put(i, null);
			}
			else{
				map.put(i, 1);
			}
		}
		return map;
	}

}


