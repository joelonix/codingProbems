package cracking.coding.problems;

import java.util.HashSet;

public class FindDupUsingSet {

		// TODO Auto-generated method stub
		
			public static void main(String[] args)
			{
				//String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
				
				String[] strArray={"Joel","Onix","Joel","Francis","Onix"};

				int [] intArray = {20,10,20,20,10,30,40,80};
				//1. Using Brute Fo,ce Method

				for (int i = 0; i < strArray.length; i++)
				{
					for (int j = i+1; j < strArray.length; j++)
					{
						if( (strArray[i].equals(strArray[j])))
						{
							System.out.println("Duplicate Element is : "+strArray[i]);
						}
					}
				}

				//2. Using HashSet String//

				HashSet<String> set = new HashSet<String>();

				for (String arrayElement : strArray)
				{
					if(!set.add(arrayElement))
					{
						System.out.println("Duplicate Element is : "+arrayElement);
					}
				}
			
			
			HashSet<Integer> st = new HashSet<Integer>();

			for (int arrayElement : intArray)
			{
				if(!st.add(arrayElement))
				{
					System.out.println("Duplicate Element is : "+arrayElement);
				}
			}
		}
		

	}

	

