package cracking.coding.problems;

public class Anagram {

	/*
	 * One way to find if two Strings are anagram in Java. This method
	 * assumes both arguments are not null and in lowercase.
	 *
	 * @return true, if both String are anagram
	 */
	 
	 //Joel Francis
	public static boolean isAnagram(String word, String anagram){       
		if(word.length() != anagram.length()){
			return false;
		}

		char[] chars = word.toCharArray();

		for(char c : chars){
			int index = anagram.indexOf(c);
			if(index != -1){
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
			}else{
				return false;
			}           
		}

		return anagram.isEmpty();
	}
	
	public static void main(String args[])
	{
		
		System.out.println(Anagram.isAnagram("cat", "ac0"));
	}
}


