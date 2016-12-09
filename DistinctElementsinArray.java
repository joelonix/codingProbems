package cracking.coding.problems;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElementsinArray {

	private static List<Integer> findDistinctNumbers(int[] arr) {

		Map<Integer, Integer> frequencyMap = createElementFrequencyMap(arr);

		return findNumbersWithFrequencyOne(frequencyMap);
	}

	private static List<Integer> findNumbersWithFrequencyOne(Map<Integer, Integer> frequencyMap) 
		{
		List<Integer> distinctNumbers = new ArrayList<Integer>();

		for(Map.Entry<Integer, Integer> entry:frequencyMap.entrySet()){
			
			if(entry.getValue()==1){
				distinctNumbers.add(entry.getKey());
			}
		
		
		}
		return distinctNumbers;
	}

	private static Map<Integer, Integer> createElementFrequencyMap(int[] arr) {

		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int key : arr) {
			if (frequencyMap.containsKey(key)) {
				frequencyMap.put(key, frequencyMap.get(key) + 1);
			} else {
				frequencyMap.put(key, 1);
			}
		}

		return frequencyMap;
	}

	private static void print(List<Integer> numberList) {
		for (int number : numberList) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 2, 6, 9, 4, 6 };
		List<Integer> distinctNumbers = findDistinctNumbers(arr);
		System.out.println("Distinct elements are : ");
		print(distinctNumbers);
	}
}
