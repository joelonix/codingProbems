package cracking.coding.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 


/*
 * Write a program to find out duplicate characters in a string. 
 */
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str){
         
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
            //if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            //}
        }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}
