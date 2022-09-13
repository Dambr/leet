package leet.task41;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int firstMissingPositive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		
		int result = 1;
		for (result = 1; result <= Integer.MAX_VALUE; result++) {
			if (set.add(result)) {
				break;
			}
		}
		
		return result;
	}

}
