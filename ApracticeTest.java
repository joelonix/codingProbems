package cracking.coding.problems;



public class ApracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,5,3,4,7,5,6};
		
		ApracticeTest ap=new ApracticeTest();
		int k=ap.findKthLargest(arr,2);
		//System.out.println(arr[k]);
		System.out.println(k);

	}

	public int findKthLargest(int[] nums, int k) {
		if (k < 1 || nums == null) {
			return 0;
		}
	 
		return getKth(nums.length - k+1, nums, 0, nums.length - 1);
	}
	 
	public int getKth(int k, int[] nums, int start, int end) {
	 
		int pivot = nums[end];
	 
		int left = start;
		int right = end;
	 
		while (true) {
	 
			while (nums[left] <pivot && left < right) {
				left++;
			}
	 
			while (nums[right] >= pivot && right > left) {
				right--;
			}
	 
			if (left == right) {
				break;
			}
	 
			swap(nums, left, right);
		}
	 
		swap(nums, left, end);
	 
		if (k == left + 1) {
			return pivot;
		} else if (k < left + 1) {
			return getKth(k, nums, start, left - 1);
		} else {
			return getKth(k, nums, left + 1, end);
		}
	}
	 
	public void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}
}
