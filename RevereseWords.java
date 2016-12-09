package cracking.coding.problems;

public class RevereseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Amazon is an ecommerce";

		StringBuilder sb=new StringBuilder();

		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		//System.out.println(sb.toString());
		
		String str1="Amazon is an ecommerce";
		
		System.out.println("The reverse order string words is --"+reverseWordOrder(str1));

	}
	
	private static String reverseWordOrder(String str){
		
		String [] words=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for (int i = words.length-1;i>=0; i--) {
			sb.append(words[i]);
			sb.append(" ");
			
		}
		
		sb.deleteCharAt(str.length());
		
		return sb.toString();
	}

}
