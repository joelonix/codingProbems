package cracking.coding.problems;


import java.util.HashSet;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchifyIntersection {
 
	public static void main(String[] args) {
        Integer[ ] arrayOne = { 1, 4, 5, 2, 7, 3, 9 };
        Integer[ ] arrayTwo = { 5, 2, 4, 9, 5 };
 
        Integer[ ] common = CrunchifyIntersection.findCommon( arrayOne, arrayTwo );
 
        System.out.print( "Common Elements Between Two Arrays: " );       
        for( Integer entry : common ) {
            System.out.print( entry + "," );
        }
	}
	   public static Integer[ ] findCommon( Integer[ ] arrayOne, Integer[ ] arrayTwo ) {
 
	    	Integer[ ] arrayToHash;
	    	Integer[ ] arrayToSearch;
 
	    	if( arrayOne.length < arrayTwo.length ) {
	    		arrayToHash = arrayOne;
	    		arrayToSearch = arrayTwo;
	    	} else {
	    		arrayToHash = arrayTwo;
	    		arrayToSearch = arrayOne;
	    	}
 
	        HashSet<Integer> intersection = new HashSet<Integer>( );
 
	        HashSet<Integer> hashedArray = new HashSet<Integer>( );
	        for( Integer entry : arrayToHash ) {
	            hashedArray.add( entry );
	        }
 
	        for( Integer entry : arrayToSearch ) {
	            if( hashedArray.contains( entry ) ) {
	                intersection.add( entry );
	            }
	        }
 
	        return intersection.toArray( new Integer[ 0 ] );
	    }
}
