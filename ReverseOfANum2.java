package cracking.coding.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOfANum2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		//Enter the number
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());

		int temp=no;
		while (temp!=0) 
		{

			int digit=temp%10;

			temp=temp/10;
			System.out.print(digit);
		}
	}

}
