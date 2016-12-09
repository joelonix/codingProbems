package cracking.coding.problems;
public class Implementation {  

	public static void main(String args[]) {  

		int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 };  
		int toSearch = 3;  

		//LinearSearch linearSearch = new LinearSearch();  
		BinarySearch binarySearch = new BinarySearch();  

		/*System.out.println("Linear Search Index : "  
    + linearSearch.searchElementLinear(numList, toSearch));*/  
		System.out.println("Binary Search Index : "+ binarySearch.searchElementBinary(numList, toSearch));  

	}  
}  