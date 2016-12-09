package cracking.coding.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CheckMaxAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr={3,2,1,2,2,3};
		int[] arr = { 2, 5, 3,5};
		// int[] arr = { 3, 4, 2, 1, 3, 5, 6, 1, 3 };
		List<Integer> maximumRepeatingElements = findMaximumRepeatingElements(arr);

		System.out.println("Maximum repeating elements are : ");
		print(maximumRepeatingElements);


	}

	private static List<Integer> findMaximumRepeatingElements(int[] arr) {
		Map<Integer, Integer> frequencyMap = createElementFrequencyMap(arr);

		return getMaxRepeatingElements(frequencyMap);
	}

	private static List<Integer> getMaxRepeatingElements(Map<Integer, Integer> frequencyMap) {

		List<Integer> repeatingElements = new ArrayList<Integer>();
		int count = 2;
		
		for(Map.Entry<Integer, Integer> entry:frequencyMap.entrySet())
		{
			int value = entry.getValue();
			int key = entry.getKey();

			if (value > count) {
				/* If a new element with more frequency is found then clear the
                 existing elements */
				repeatingElements.clear();
				repeatingElements.add(key);
				count = value;
			} else if (value == count) {
				repeatingElements.add(key);
				count = value;
			}
		}
		return repeatingElements;
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

	private static void print(List<Integer> list) {
		for (Integer number : list) {
			System.out.println(number);
		}
	}
}
