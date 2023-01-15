package leet.task27;

import java.util.Arrays;

public class Solution {

	public int removeElement(int[] nums, int val) {
		
		int[] array = Arrays.stream(nums).boxed()
		.filter(v -> v != val)
		.mapToInt(v -> v)
		.toArray();
		
		int arrayLength = array.length;
		int k = arrayLength;
		
		for (int i = 0; i < arrayLength; i++) {
			nums[i] = array[i];
		}
		
		return k;
	}
	
}
