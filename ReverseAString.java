package cracking.coding.problems;


public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original=453;
		
		String orginalString="JOEL is my name";
		
		String rev="";
		String rev1="";
		
		String input=String.valueOf(original);
		
		for (int i=input.length()-1; i>=0;i--) {
			
			rev=rev+input.charAt(i);
		}
		
		//int no=Integer.parseInt(rev);
		
		System.out.print(rev);
		
		for (int j=orginalString.length()-1;j>0;j--) {
			
			rev1=rev1+orginalString.charAt(j);
		}
		
		System.out.print("\n"+rev1);

	
	}

}
