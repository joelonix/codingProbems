package cracking.coding.problems;

public class ThirdLargestII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,8,4,5,12,2,5,6,7,1,90,100,56,8,34};

		int temp, first, second, third;
		first = second = third = arr[0];
		for (int i: arr)
		{
			if (first < i)
			{
				temp = first;
				first = i;
				second = temp;
			}
			if (second < i && first > i)
			{
				temp = i;
				second = i;
				third = temp;
			}
			if (third < i && second > i)
			{
				temp = i;
				third=i;
			}
		}
		System.out.println(third);

	}

}
