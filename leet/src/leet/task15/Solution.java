package leet.task15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new LinkedList<>();
		int length = nums.length - 2;
		for (int i = 0; i < length; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int j = i + 1;
				int k = nums.length - 1;
				int sum = 0 - nums[i];
				while (j < k) {
					if (nums[j] + nums[k] == sum) {
						List<Integer> list = List.of(nums[i], nums[j], nums[k]);
						result.add(list);
						while (j < k && nums[j] == nums[j + 1]) {
							j++;
						}
						while (j < k && nums[k] == nums[k - 1]) {
							k--;
						}
						j++;
						k--;
					} else if (nums[j] + nums[k] < sum) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return result;
	}
}
