package cracking.coding.problems;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="JJOOEL";
		Character s=nonRepeated(word);
		System.out.println(s);


	}


	public static Character nonRepeated(String str){
		Character c;
		Map<Character, Integer> map=new HashMap<Character, Integer>();

		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);

			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);	
			}
			else
			{
				map.put(c, 1);
			}


		}

		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(map.get(c)==1)
			{
				//return c;	
				System.out.println(c);
			}
		}

		return null;
	}
}

