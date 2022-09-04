package leet.task26;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	public int removeDuplicates(int[] nums) {
		Set<Integer> set = new TreeSet<>();
		
		for (int num : nums) {
			set.add(num);
		}
		
		List<Integer> list = set.stream().toList();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			nums[i] = list.get(i);
		}
		
		return set.size();
	}
}
