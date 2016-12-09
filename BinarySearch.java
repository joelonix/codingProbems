package cracking.coding.problems;
public class BinarySearch {  

	int searchElementBinary(int numList[], int toSearch) {  

		int startIndex = 0;  
		int endIndex = numList.length - 1;  
		int midindex = (startIndex + endIndex) / 2;  
		int midElement = numList[midindex];  
		int foundIndex = 0;  

		while (startIndex <= endIndex) {  
			if (midElement < toSearch) {  
				startIndex = midindex + 1;  
				midindex = (startIndex + endIndex) / 2;  
				midElement = numList[midindex];  
			} else if (midElement > toSearch) {  
				endIndex = midindex - 1;  
				midindex = (startIndex + endIndex) / 2;  
				midElement = numList[midindex];  
			} else {  
				foundIndex = midindex;  
				break;  
			}  
		}  
		return foundIndex;  
	}  

}  