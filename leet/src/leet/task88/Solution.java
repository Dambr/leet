package leet.task88;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list1 = toList(nums1, m);
		List<Integer> list2 = toList(nums2, n);
		list1.addAll(list2);
		list1.sort(Integer::compareTo);
		writeToArray(list1, nums1);
	}
	
	private List<Integer> toList(int[] array, int size) {
		List<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < size; i++) {
			int element = array[i];
			list.add(element);
		}
		
		return list;
	}
	
	private void writeToArray(List<Integer> list, int[] array) {
		int size = list.size();
		
		for (int i = 0; i < size; i++) {
			int element = list.get(i);
			array[i] = element;
		}
	}

}
