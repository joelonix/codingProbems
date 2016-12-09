package cracking.coding.problems;

import java.util.*;
public class ReverseWordUsingStack 
{
	public static void main(String[] args) {
		String a = "Neil Peart rocks YYZ";
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
