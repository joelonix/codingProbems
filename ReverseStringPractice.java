package cracking.coding.problems;

import java.util.Stack;

public class ReverseStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amazon is an ecommerce";

		StringBuilder sb=new StringBuilder();

		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		
		String a=sb.toString();
		
		Stack <String> stack = new Stack <String>();
		String[] temp;
		String delimiter = " ";
		// given string will be split by the argument delimiter provided. 
		temp = a.split(delimiter);
		// push substring to stack
		for(int i =0; i < temp.length ; i++)
		{
			stack.push(temp[i]);
		}
		System.out.println("\nOriginal string: " + a);
		System.out.print("\nReverse word string: ");
		while(!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}
		System.out.println("\n");

	}

}
