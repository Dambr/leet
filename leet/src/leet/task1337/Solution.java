package leet.task1337;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public int[] kWeakestRows(int[][] mat, int k) {
		
		int[] result = new int[k];
		
		Set<Row> set = new TreeSet<>();
		
		for (int i = 0; i < mat.length; i++) {
			Row row = new Row(mat[i], i);
			set.add(row);
		}
		
		Queue<Row> queue = toQueue(set);
		
		for (int i = 0; i < result.length; i++) {
			Row row = queue.poll();
			int index = row.getIndex();
			result[i] = index;
		}
		
		return result;
	}
	
	private Queue<Row> toQueue(Set<Row> rows) {
		
		Queue<Row> result = new LinkedList<>();
		
		for (Row row : rows) {
			result.add(row);
		}
		
		return result;
	}

}
