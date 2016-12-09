package cracking.coding.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatesinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ababcdefa";
		
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for(Character ch:charArray){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
        
        for(Map.Entry<Character, Integer> mt:dupMap.entrySet())
        {
           
        	System.out.println(mt.getKey()+"-------->"+mt.getValue());
        }
    }

	}


