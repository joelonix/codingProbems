package cracking.coding.problems;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPermutation("mary","arms"));
		
	}
	
	static boolean isPermutation(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}
		
		int[] letters=new int[128];//Assumption
		
		char[] s_array=s.toCharArray();
		
		for(char c:s_array)
		{
			letters[c]++;
		}
		
		for(int j=0;j<letters.length;j++){
			System.out.println(letters[j]);
		}
		
		for(int i=0;i<t.length();i++){
			int c=(int)t.charAt(i);
			letters[c]--;
			if(letters[c]<0){
				return false;
				
			}
		}
		
		return true;
	}

}
