package cracking.coding.problems;

public class ISuniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUniqueChars("joejl"));

	}
	
	static boolean isUniqueChars(String str)
	{
		if(str.length()>128){
			return false;
		}
		
		boolean [] char_set=new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			
			int val=str.charAt(i);
			
			if(char_set[val]){
				return false;
			}
			char_set[val]=true;
		}
		
		return true;
	}

}
