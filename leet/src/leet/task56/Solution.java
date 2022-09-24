package leet.task56;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

	public int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (array1, array2) -> {
			int[] arr1 = (int[]) array1;
			int[] arr2 = (int[]) array2;
			int start1 = arr1[0];
			int start2 = arr2[0];
			return Integer.compare(start1, start2);
		});

		LinkedList<int[]> list = new LinkedList<>();
		list.add(intervals[0]);

		for (int i = 1; i < intervals.length; i++) {
			int[] array1 = intervals[i];
			int[] array2 = list.getLast();

			boolean isOverrlip = isOverrlip(array2, array1);
			if (isOverrlip) {
				int[] merged = merge(array1, array2);
				list.removeLast();
				list.add(merged);
			} else {
				list.add(array1);
			}

		}

		int[][] result = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	private boolean isOverrlip(int[] array1, int[] array2) {
		int start1 = array1[0];
		int end1 = array1[1];

		int start2 = array2[0];

		return (start1 >= start2) || (end1 >= start2);
	}

	private int[] merge(int[] array1, int[] array2) {
		int start1 = array1[0];
		int end1 = array1[1];

		int start2 = array2[0];
		int end2 = array2[1];

		int start = Math.min(start1, start2);
		int end = Math.max(end1, end2);

		int[] result = { start, end };
		return result;
	}

}
