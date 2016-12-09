package cracking.coding.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {

        String[] withDuplicates = new String[] {"one","two","three","one","two"};
        String[] withoutDuplicates = new String[] {"one","two","three"};

        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        //System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));

    }

    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set<String> tempSet = new HashSet<String>();
        Map<String, Integer> tempMap = new HashMap<String, Integer>();
        boolean flag = false;
        for (String str : input) {
            if (!tempSet.add(str)) {
                tempMap.put(str, tempMap.get(str) + 1);
                flag = true;
            } else {
                tempMap.put(str, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : tempMap.entrySet()){
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        return flag;
    }
}
