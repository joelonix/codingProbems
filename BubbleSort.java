package cracking.coding.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements");

		int n=Integer.parseInt(br.readLine());

		//Enter the array elements
		int arr[]=new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter an integer:");
			arr[i]=Integer.parseInt(br.readLine());
		}

		//Use bubble sort technique to sort the given array
		int temp,limit=n-1;boolean flag=false;
		
		for (int i = 0; i < limit; i++) {
			
			for (int j = 0; j < limit-i; j++) {
				
				if(arr[j]>arr[j+1]){
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				
			}
			
			if(flag=false){
				break;
			}
			else{
				flag=false;
			}
		}
		
		//The sorted array is 
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}


	}

}
