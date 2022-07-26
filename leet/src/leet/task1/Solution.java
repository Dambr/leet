package leet.task1;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		
		int[] result = new int[2];
		
		label:
		for (int fIndex = 0; fIndex < nums.length; fIndex++) {
			int fNumber = nums[fIndex];
			int sNumber = target - fNumber;
			for (int sIndex = 0; sIndex < nums.length; sIndex++) {
				if (sIndex != fIndex) {
					if (nums[sIndex] == sNumber) {
						result[0] = fIndex;
						result[1] = sIndex;
						break label;
					}
				}
			}
		}
		
		return result;
	}

}
