package leet.task55;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public boolean canJump(int[] nums) {
		boolean result = recursiveJump(nums, 0);

		return result;
	}

	private boolean recursiveJump(int[] nums, int position) {
		boolean result = false;
		int target = nums.length - 1;

		if (position >= target) {
			result = true;
		} else {
			int jumpLength = nums[position];
			List<Integer> jumpIndexes = new LinkedList<>();
			for (int i = jumpLength; i >= 1; i--) {
				int newPosition = position + i;
				if (newPosition >= target) {
					jumpIndexes.add(target);
					break;
				} else {
					int newLength = nums[newPosition];
					if (newPosition + newLength > position + jumpLength) {
						jumpIndexes.add(newPosition);
					}
				}
			}

			if (jumpIndexes.contains(target)) {
				result = true;
			} else {

				if (jumpIndexes.size() > 0) {

					int maxLengthJumpIndex = jumpIndexes.get(0);

					for (int jumpIndex : jumpIndexes) {
						int maxLength = maxLengthJumpIndex + nums[maxLengthJumpIndex];
						int curLength = jumpIndex + nums[jumpIndex];
						if (curLength > maxLength) {
							maxLengthJumpIndex = jumpIndex;
						}
					}

					result = recursiveJump(nums, maxLengthJumpIndex);
				}

			}
		}

		return result;
	}

}
