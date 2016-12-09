package cracking.coding.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={ 2, 3, 2, 4, 5, -1, 6, 4 };
		int[] arr2={3,2,1,2,2,3};

		Map<Integer, Integer> frequencyMap = findFrequency(arr);
		System.out.println("Frequency of elements :");
		//printMap(frequencyMap);
		printUsingSet(frequencyMap);

	}

	private static  Map<Integer,Integer> findFrequency(int [] arr){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();

		for(int i: arr){
			//get value
			boolean val=map.containsKey(i);
			//if val exists
			if(val){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
		}

		return map;
	}



	private static void printUsingSet(Map<Integer, Integer> map) 
	{

		// Get the iterator for key set of the map
		Set<Integer> keys=map.keySet();

		for (Integer k:keys) {
			System.out.println(k+"----->"+map.get(k));
		}


	}

	/*private static void printMap(Map<Integer, Integer> map) {

   // Get the iterator for key set of the map
   Iterator<Integer> iterator = map.keySet().iterator();

   while (iterator.hasNext()) {
       Integer key = iterator.next();
       System.out.println(key + " ->" + map.get(key));
   }
}*/

}
