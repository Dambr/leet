package leet.task53;

public class Solution {

	public int maxSubArray(int[] nums) {

		int max = nums[0];
		int dp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp = Math.max(dp + nums[i], nums[i]);
			max = Math.max(dp, max);
		}
		return max;

	}

}
