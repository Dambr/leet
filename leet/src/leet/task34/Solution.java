package leet.task34;

public class Solution {

	public int[] searchRange(int[] nums, int target) {
		int firstIndex = findFirstIndex(nums, target);
		int lastIndex = findLastIndex(nums, target);
		int[] result = { firstIndex, lastIndex };
		return result;
	}

	private int findFirstIndex(int[] nums, int target) {
		int result = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result = i;
				break;
			}
		}

		return result;
	}

	private int findLastIndex(int[] nums, int target) {
		int result = -1;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == target) {
				result = i;
				break;
			}
		}

		return result;
	}

}
