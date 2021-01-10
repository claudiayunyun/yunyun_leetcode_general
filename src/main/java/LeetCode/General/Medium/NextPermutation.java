package LeetCode.General.Medium;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		/*
		 * Start searching from the right for the first decreasing point
		 * swap
		 * reverse
		 */
        
		int reversePoint = 0;
		for(int i = nums.length - 1; i > 0; i--) {
			if(nums[i - 1] < nums[i]) {
				reversePoint = i;
				for(int j = nums.length - 1; j >= i;j--) {
					if(nums[j] > nums[i - 1]) {
						swap(nums, i - 1, j);
						break;
					}					
				}
				break;
			}
		}
		reverse(nums, reversePoint);
    }
	
	private void swap(int[]nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private void reverse(int[] nums, int reversePoint) {
		int i = reversePoint;
		int j = nums.length - 1;
		while(i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}
}
