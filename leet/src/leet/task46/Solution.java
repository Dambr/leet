package leet.task46;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> result = new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		for (int i : nums) {
			list.add(i);
		}
		int k = 0;

		permute(result, list, k);
		
		return result;
	}

	private void permute(List<List<Integer>> result, List<Integer> arr, int k) {
		for (int i = k; i < arr.size(); i++) {
			Collections.swap(arr, i, k);
			permute(result, arr, k + 1);
			Collections.swap(arr, k, i);
		}
		if (k == arr.size() - 1) {
			List<Integer> list = new LinkedList<>(arr);
			result.add(list);
		}
	}
}
