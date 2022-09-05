package leet.task33;

import java.util.Arrays;

public class Solution {

	public int search(int[] nums, int target) {
		int pivot = target;
		if (pivot >= nums.length) {
			pivot = nums.length - 1;
		}
		int[] fPart = Arrays.copyOfRange(nums, 0, pivot);
		int[] sPart = Arrays.copyOfRange(nums, pivot, nums.length);

		int result = indexOf(nums, target);

		int index = 0;
		for (int i = 0; i < sPart.length; i++) {
			nums[index] = sPart[i];
			index++;
		}
		for (int i = 0; i < fPart.length; i++) {
			nums[index] = fPart[i];
			index++;
		}

		return result;
	}

	private int indexOf(int[] nums, int target) {
		int result = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result = i;
				break;
			}
		}

		return result;
	}

}
