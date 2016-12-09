package cracking.coding.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number");

		int no=Integer.parseInt(br.readLine());
		
		int temp=no,sum=0;
		
		String t=temp+"";
		
		int len=t.length();
		
		while(temp!=0){
		
			int digit=temp%10;
			
			sum=sum+(int)Math.pow(digit, len);
			
			temp=temp/10;
		}
		
		if(sum==no){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Nope");
		}
		
	}

}
